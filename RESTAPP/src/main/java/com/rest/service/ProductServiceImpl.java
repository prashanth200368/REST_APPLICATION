package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Product;
import com.rest.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	
	ProductRepository productRepository;
	@Override
	public List<Product> getAllProducts() {
	    
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	
	@Override
	public Product getProductById(int id) {
		
		return productRepository.findById(id).get();
	}
	

	@Override
	public Product insert(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public void updateProduct(int id, Product product) {
		
		Product p = productRepository.findById(id).get();
		p.setProductname(product.getProductname());
		p.setPrice(product.getPrice());
		productRepository.save(p);
		
	}

	@Override
	public void deleteProduct(int id) {
		
		productRepository.deleteById(id);
	}
	

}
