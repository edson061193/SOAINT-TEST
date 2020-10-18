package com.edson.carritoventas.repository;

import com.edson.carritoventas.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Serializable> {

}
