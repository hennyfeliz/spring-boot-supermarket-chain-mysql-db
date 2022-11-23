package com.crud.Controllers.TiendaControllersPackage;


import com.crud.Models.Tiendas;
import com.crud.Repository.TiendaRepository;
import com.crud.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cadena_tiendas")
public class TiendaController {

    @Autowired
    TiendaRepository tiendaRepository;

    @GetMapping("/tiendas")
    public List<Tiendas> getAllTiendas(){
        return tiendaRepository.findAll();
    }

    @PostMapping("/postTiendas")
    public Tiendas createTienda(@Valid @RequestBody Tiendas tienda){
        return tiendaRepository.save(tienda);
    }

    @GetMapping("/tienda/{codigo_tienda}")
    public Tiendas getTiendasById(@PathVariable(value = "codigo_tienda") Integer codigo_tienda) {
        return tiendaRepository.findById(codigo_tienda)
                .orElseThrow(() -> new ResourceNotFoundException("Tiendas", "codigo_tienda", codigo_tienda));
    }

    @PutMapping("/tienda/{codigo_tienda}")
    public Tiendas updateTienda(@PathVariable(value = "codigo_tienda") Integer codigo_tienda,
        @Valid @RequestBody Tiendas tiendaDetails) {

        Tiendas tienda = tiendaRepository.findById(codigo_tienda)
                .orElseThrow(() -> new ResourceNotFoundException("Tienda" ,"codigo_tienda", codigo_tienda));

        tienda.setCodigo_tienda(tiendaDetails.getCodigo_tienda());
        tienda.setNombre_tienda(tiendaDetails.getNombre_tienda());
        tienda.setDireccion_tienda(tiendaDetails.getDireccion_tienda());
        tienda.setEstado(tiendaDetails.getEstado());
        tienda.setCantidad_empleado(tiendaDetails.getCantidad_empleado());

        return tiendaRepository.save(tienda);
    }

    @DeleteMapping("/tienda/{codigo_tienda}")
    public ResponseEntity<?> deleteTienda(@PathVariable(value = "codigo_tienda") Integer codigo_tienda){
        Tiendas tienda = tiendaRepository.findById(codigo_tienda)
                .orElseThrow(() -> new ResourceNotFoundException("Tiendas", "codigo_tienda", codigo_tienda));

        tiendaRepository.delete(tienda);

        return ResponseEntity.ok().build();
    }

}
