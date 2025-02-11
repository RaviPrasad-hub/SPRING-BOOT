package com.coconut.springweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coconut.springweb.ProductRepository.ProductRepository;
import com.coconut.springweb.entities.Product;


@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository repository; 
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class);

	@GetMapping("/products/")
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
	@GetMapping("/products/{id}")
	@Transactional(readOnly = true)
	@Cacheable("product-cache")
	public Product getProduct(@PathVariable("id") int id) {
		LOGGER.info("Fetch product details by ID " + id);
		return repository.findById(id).get();
	}
	
	@PostMapping("/products/")
	public void createProduct(@RequestBody Product product) { //de-serialization
	     repository.save(product);	
	}
	
	@PutMapping ("/products/") // ORM uses the id
	public void updateProduct(@RequestBody Product product) {
	     repository.save(product);	
	}
	
	@DeleteMapping("/products/{id}")
	@CacheEvict("product-cache")
	public void deleteProduct(@PathVariable("id") int id) {
	     repository.deleteById(id);	
	}
	
	
}
