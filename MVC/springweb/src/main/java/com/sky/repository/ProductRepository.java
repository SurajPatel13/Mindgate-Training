package com.sky.repository;

import java.util.List;

import com.sky.jdbc.domain.Product;

public interface ProductRepository {
	public void addProduct(Product product);
	public List<Product>getProducts();
}
