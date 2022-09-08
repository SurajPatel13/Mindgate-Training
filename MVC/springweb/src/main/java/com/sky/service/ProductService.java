package com.sky.service;

import java.util.List;

import com.sky.jdbc.domain.Product;

public interface ProductService {

	public void addProduct(Product product);
	public List<Product>getProducts();

}
