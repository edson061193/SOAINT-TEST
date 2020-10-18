package com.edson.carritoventas.repository;

import com.edson.carritoventas.entity.ClienteEntity;
import com.edson.carritoventas.entity.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface VentaRepo extends JpaRepository<VentaEntity, Serializable> {
   // List<VentaEntity> findByIdcliente(ClienteEntity clienteEntity);
}
