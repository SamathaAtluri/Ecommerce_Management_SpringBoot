
package com.vcube.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vcube.Ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
