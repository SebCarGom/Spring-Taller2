package com.nttdata.SCAGspringtaller2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.SCAGspringtaller2.persistence.Product;
import com.nttdata.SCAGspringtaller2.persistence.ProductRepositoryI;

@Service
public class ProductServiceImpl implements ProductServiceI{

	@Autowired
	private ProductRepositoryI productRepositoryI;
	
	@Override
	public Product addProduct(Product newProduct) {
		productRepositoryI.save(newProduct);
		
		return newProduct;
	}

	@Override
	public double getProductRetailPrice(Product product) {
		return productRepositoryI.findByProductPriceRetail(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepositoryI.findAll();
	}

}
