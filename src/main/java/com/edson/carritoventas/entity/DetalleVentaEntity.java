package com.edson.carritoventas.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DETALLEVENTA")
public class DetalleVentaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="iddetalleventa")
    private long id;

    @ManyToOne
    @Column(name = "idventa")
    private VentaEntity idventa;

    @ManyToOne
    @Column(name = "idproducto")
    private ProductoEntity idproducto;

    public DetalleVentaEntity(long id, VentaEntity idventa, ProductoEntity idproducto) {
        this.id = id;
        this.idventa = idventa;
        this.idproducto = idproducto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public VentaEntity getIdventa() {
        return idventa;
    }

    public void setIdventa(VentaEntity idventa) {
        this.idventa = idventa;
    }

    public ProductoEntity getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(ProductoEntity idproducto) {
        this.idproducto = idproducto;
    }
}
