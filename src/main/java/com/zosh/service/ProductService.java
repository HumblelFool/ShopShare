package com.zosh.service;

import java.util.List;

import com.zosh.exception.ProductException;
import com.zosh.modal.Product;
import com.zosh.request.CreateProductRequest;
import com.zosh.user.domain.ProductSubCategory;

public interface ProductService {
	
	// only for admin
	public Product createProduct(CreateProductRequest req) throws ProductException;
	
	public String deleteProduct(Long productId) throws ProductException;
	
	public String updateProduct(Long productId)throws ProductException;
	
	public List<Product> getAllProducts();
	
	// for user and admin both
	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findProductByCategory(String category);
	
	public List<Product> searchProduct(String query);
	
	public List<Product> getAllProduct();
	
	

}
