
package com.vcube.Ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer productid;

    String productName;

    Double price;

    Integer quantity;
    @ManyToOne
    @JoinColumn(name = "category_id")
  
    Category category;
}
