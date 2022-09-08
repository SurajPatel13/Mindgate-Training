package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.jdbc.domain.Product;
import com.sky.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	
	public void addProduct(Product product) {
		System.out.println("in service");
		if(product.getPrice()>20)
			productRepository.addProduct(product);
		
	}
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

}
