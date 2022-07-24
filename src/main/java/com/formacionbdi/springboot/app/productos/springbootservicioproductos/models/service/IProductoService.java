package com.formacionbdi.springboot.app.productos.springbootservicioproductos.models.service;

import com.formacionbdi.springboot.app.commons.springbootserviciocommons.models.entity.Producto;

import java.util.List;

public interface IProductoService {

  List<Producto> findAll();
  Producto findById(Long id);

  Producto save(Producto producto);

  void deleteById(Long id);
}
