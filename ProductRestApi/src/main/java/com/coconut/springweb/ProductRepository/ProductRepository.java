package com.coconut.springweb.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coconut.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
