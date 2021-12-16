package com.nttdata.SCAGspringtaller2.services;

import java.util.List;

import com.nttdata.SCAGspringtaller2.persistence.Product;

public interface ProductServiceI {
	
	public Product addProduct(final Product newProduct);
	
	public double getProductRetailPrice(final Product product);

	public List<Product> getAllProducts();
	
}
