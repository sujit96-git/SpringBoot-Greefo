package com.greefo.Greefo.dao;

import java.util.ArrayList;

import com.greefo.Greefo.entity.Product;

public interface ProductDao {
	public ArrayList<Product> getAllProducts();
	public Product getProductById(Product id);
	public Product getProductByName(Product name);
	public Product getProductByCategory(Product category);
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProductByName(Product name);

}
