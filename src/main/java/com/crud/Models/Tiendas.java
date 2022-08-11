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
@Table(name = "tienda")
public class Tiendas {

    @Id
    @Column
    private Integer codigo_tienda;

    @Column
    private String nombre_tienda;

    @Column
    private String direccion_tienda;

    @Column
    private String estado;

    @Column
    private int cantidad_empleado;

}
