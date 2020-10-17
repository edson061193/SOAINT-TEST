package com.edson.carritoventas.rest;

import com.edson.carritoventas.dto.User;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@RestController
public class UserController {

    @PostMapping("/login")
    public User login(@RequestBody User usuarioRequest) {
        User user = new User();
        String token="";
        try{
            token = validarUsuario(usuarioRequest);
            user.setUsuario(usuarioRequest.getUsuario());
            user.setClave("***");
            user.setToken(token);
        }catch (Exception e){

        }
        return user;

    }

    private String validarUsuario(User user) {
        String token = null;
        try {
            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/static/usuarios.txt"));
            String line = null;
            while ((line = lector.readLine()) != null) {
                String[] usuario = line.split(",");
                if(user.getUsuario().equalsIgnoreCase(usuario[0].trim()) && user.getClave().equalsIgnoreCase(usuario[1].trim())){
                    token = getJWTToken(user.getUsuario());
                    break;
                }
            }
            lector.close();
        }catch (Exception e){
            throw new RuntimeException("Se produjo un error al iniciar session");
        }
        return token;
    }

    private String getJWTToken(String username) {
        String secretKey = "keySecretEds";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("edson061193JWT")
                .setSubject(username)
                .claim("authorities",grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,secretKey.getBytes()).compact();
        return "Bearer " + token;
    }
}
