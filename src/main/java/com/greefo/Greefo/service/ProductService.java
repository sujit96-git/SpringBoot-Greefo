package com.greefo.Greefo.service;

import java.util.ArrayList;

import com.greefo.Greefo.entity.Product;

public interface ProductService {
	
	public ArrayList<Product> getAllProducts();
	public Product getProductyId(Product id);
	public Product getProductyName(Product name);
	public Product getProductyCategory(Product category);
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProductByName(Product names);

}
