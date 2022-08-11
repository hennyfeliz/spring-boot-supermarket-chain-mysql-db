package com.crud.Controllers.EmpleadoControllerPackage;

import com.crud.Models.Empleados;
import com.crud.Repository.EmpleadoRepository;
import com.crud.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cadena_tiendas")
public class EmpleadoController {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @GetMapping("/empleados")
    public List<Empleados> getAllTiendas(){
        return empleadoRepository.findAll();
    }

    @PostMapping("/postEmpleados")
    public Empleados createEmpleado(@Valid @RequestBody Empleados empleado){
        return empleadoRepository.save(empleado);
    }

    @GetMapping("/empleado/{codigo_empleado}")
    public Empleados getEmpleadosById(@PathVariable(value = "codigo_empleado") Integer codigo_empleado) {
        return empleadoRepository.findById(codigo_empleado)
                .orElseThrow(() -> new ResourceNotFoundException("Empleados", "codigo_empleado", codigo_empleado));
    }

    @PutMapping("/empledo/{codigo_empleado}")
    public Empleados updateEmpleado(@PathVariable(value = "codigo_empleado") Integer codigo_empleado,
                                @Valid @RequestBody Empleados empleadoDetails) {

        Empleados empleado = empleadoRepository.findById(codigo_empleado)
                .orElseThrow(() -> new ResourceNotFoundException("Empleados" ,"codigo_empleado", codigo_empleado));

        empleado.setCodigo_empleado(empleadoDetails.getCodigo_empleado());
        empleado.setNombre_empleado(empleadoDetails.getNombre_empleado());
        empleado.setTelefono_empleado(empleadoDetails.getTelefono_empleado());
        empleado.setDireccion_empleado(empleadoDetails.getDireccion_empleado());
        empleado.setCodigo_tienda(empleadoDetails.getCodigo_tienda());

        Empleados updatedEmpleado = empleadoRepository.save(empleado);
        return updatedEmpleado;
    }

    @DeleteMapping("/empleado/{codigo_empleado}")
    public ResponseEntity<?> deleteTienda(@PathVariable(value = "codigo_empleado") Integer codigo_empleado){
        Empleados empleado = empleadoRepository.findById(codigo_empleado)
                .orElseThrow(() -> new ResourceNotFoundException("Empleados", "codigo_empleado", codigo_empleado));

        empleadoRepository.delete(empleado);

        return ResponseEntity.ok().build();
    }

}
