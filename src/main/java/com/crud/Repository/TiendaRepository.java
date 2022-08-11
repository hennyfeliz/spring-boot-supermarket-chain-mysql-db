package com.crud.Repository;

import com.crud.Models.Tiendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendaRepository extends JpaRepository<Tiendas, Integer> {

}
