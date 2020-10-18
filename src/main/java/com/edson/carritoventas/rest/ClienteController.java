package com.edson.carritoventas.rest;

import com.edson.carritoventas.dto.Cliente;
import com.edson.carritoventas.services.ClienteServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteServ clienteServ;

    @PostMapping(value = "/registro")
    private ResponseEntity<Cliente> insert(@RequestBody Cliente cliente){

        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteServ.insertCliente(cliente));
    }

    @PostMapping(value = "/detalleventa/{idcliente}")
    private ResponseEntity<Object> insert(@RequestBody @PathVariable("idcliente") long idcliente){

        return ResponseEntity.status(HttpStatus.OK)
                .body(clienteServ.buscarVentas(idcliente));
    }
}
