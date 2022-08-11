package com.crud.Controllers.ProductosController;

import com.crud.Models.Productos;
import com.crud.Repository.ProductosRepository;
import com.crud.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cadena_tiendas")
public class ProductosController {

    @Autowired
    ProductosRepository productosRepository;

    @GetMapping("/productos")
    public List<Productos> getAllProductos(){
        return productosRepository.findAll();
    }

    @PostMapping("/postProductos")
    public Productos createProducto(@Valid @RequestBody Productos producto){
        return productosRepository.save(producto);
    }

    @GetMapping("/producto/{codigo_producto}")
    public Productos getProductoById(@PathVariable(value = "codigo_producto") Integer codigo_producto) {
        return productosRepository.findById(codigo_producto)
                .orElseThrow(() -> new ResourceNotFoundException("Productos", "codigo_producto", codigo_producto));
    }

    @PutMapping("/productp/{codigo_producto}")
    public Productos updateProducto(@PathVariable(value = "codigo_producto") Integer codigo_producto,
                                @Valid @RequestBody Productos productoDetails) {

        Productos producto = productosRepository.findById(codigo_producto)
                .orElseThrow(() -> new ResourceNotFoundException("Productos" ,"codigo_producto", codigo_producto));

        producto.setCodigo_producto(productoDetails.getCodigo_producto());
        producto.setNombre_producto(productoDetails.getNombre_producto());
        producto.setPrecio_act_producto(productoDetails.getPrecio_act_producto());
        producto.setPrecio_tot_producto(productoDetails.getPrecio_tot_producto());
        producto.setCantidad_productos(productoDetails.getCantidad_productos());
        producto.setCodigo_producto(productoDetails.getCodigo_producto());

        Productos updatedProducto = productosRepository.save(producto);
        return updatedProducto;
    }

    @DeleteMapping("/producto/{codigo_producto}")
    public ResponseEntity<?> deleteProducto(@PathVariable(value = "codigo_producto") Integer codigo_producto){
        Productos producto = productosRepository.findById(codigo_producto)
                .orElseThrow(() -> new ResourceNotFoundException("Productos", "codigo_producto", codigo_producto));

        productosRepository.delete(producto);

        return ResponseEntity.ok().build();
    }

}