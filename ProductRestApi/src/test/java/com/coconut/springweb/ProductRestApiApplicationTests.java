package com.coconut.springweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.coconut.springweb.entities.Product;

@SpringBootTest
class ProductRestApiApplicationTests {

	@Value("${productrestapi.services.url}")
	private String baseUrl;
	
	/*
	 * @Test void testGetproduct() { RestTemplate restTemplate = new RestTemplate();
	 * Product product = restTemplate.getForObject(baseUrl + "1", Product.class);
	 * assertNotNull(product); assertEquals("Iphone", product.getName()); }
	 * 
	 * @Test void testCreateProduct() { RestTemplate restTemplate = new
	 * RestTemplate(); Product product = new Product(); product.setName("NokiaT");
	 * product.setDescription("2600 series"); product.setPrice(2000); Product
	 * newProduct = restTemplate.postForObject(baseUrl, product, Product.class);
	 * System.out.println(newProduct); assertNotNull(newProduct);
	 * assertNotNull(newProduct.getId()); assertEquals("Nokia",
	 * newProduct.getName()); }
	 * 
	 * @Test void testUpdateProduct() { RestTemplate restTemplate = new
	 * RestTemplate(); Product product = restTemplate.getForObject(baseUrl + "6",
	 * Product.class); product.setName("Blackberry"); restTemplate.put(baseUrl,
	 * product); }
	 */
	 
	
}
