package com.edson.carritoventas.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "VENTA")
public class VentaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idventa")
    private long id;

    @ManyToOne
    private ClienteEntity idcliente;

    @Column(name = "fecha")
    private Date fechaventa;

    public VentaEntity() {
    }

    public VentaEntity(long id, ClienteEntity idcliente, Date fechaventa) {
        this.id = id;
        this.idcliente = idcliente;
        this.fechaventa = fechaventa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ClienteEntity getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(ClienteEntity idcliente) {
        this.idcliente = idcliente;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }
}
