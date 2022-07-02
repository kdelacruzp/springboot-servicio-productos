package com.formacionbdi.springboot.app.productos.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "productos")
@Getter
@Setter
public class Producto implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private Double precio;

  @Column(name = "create_at")
  @Temporal(TemporalType.DATE)
  private Date createAt;
}
