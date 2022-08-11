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
@Table(name = "empleados")
public class Empleados {

    @Id
    @Column
    private Integer codigo_empleado;

    @Column
    private String nombre_empleado;

    @Column
    private int telefono_empleado;

    @Column
    private String direccion_empleado;

    @Column
    private int codigo_tienda;

}
