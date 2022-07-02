package com.formacionbdi.springboot.app.productos.springbootservicioproductos.models.service;

import com.formacionbdi.springboot.app.productos.springbootservicioproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {

  List<Producto> findAll();
  Producto findById(Long id);
}
