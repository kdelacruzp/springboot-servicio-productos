package com.formacionbdi.springboot.app.productos.springbootservicioproductos.models.dao;

import com.formacionbdi.springboot.app.commons.springbootserviciocommons.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {
}
