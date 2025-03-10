package com.rest.service;

import java.util.List;

import com.rest.model.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	
    Product getProductById(int id);
	
	Product insert(Product product);
	
	void updateProduct(int id,Product product);
	
	void deleteProduct(int id);

}
