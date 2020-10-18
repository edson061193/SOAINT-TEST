package com.edson.carritoventas.services;

import com.edson.carritoventas.dto.Cliente;
import com.edson.carritoventas.dto.DetalleVenta;
import com.edson.carritoventas.dto.Venta;
import com.edson.carritoventas.entity.ClienteEntity;
import com.edson.carritoventas.entity.DetalleVentaEntity;
import com.edson.carritoventas.entity.VentaEntity;
import com.edson.carritoventas.repository.ClienteRepository;
import com.edson.carritoventas.repository.DetalleVentaRepository;
import com.edson.carritoventas.repository.VentaRepo;
import com.edson.carritoventas.rest.UserController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServ {

    private static final Logger logger = LogManager.getLogger(ClienteServ.class);

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Autowired
    private VentaRepo ventaRepo;

    public Cliente insertCliente(Cliente cliente){
        try {
            ClienteEntity clienteEntity = new ClienteEntity(cliente);
            clienteRepository.save(clienteEntity);
            return new Cliente(clienteEntity);
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        return null;
    }

    public Object buscarVentas(long idcliente) {
        try {
            return null;
        }catch (Exception e){
            return null;
        }
    }
}
