package com.crud.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productos")
public class Productos {

    @Id
    @Column
    private Integer codigo_producto;

    @Column
    private String nombre_producto;

    @Column
    private float precio_act_producto;

    @Column
    private float precio_tot_producto;

    @Column
    private int cantidad_productos;

    @Column
    private int codigo_tienda;

}
