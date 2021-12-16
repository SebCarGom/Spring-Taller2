package com.nttdata.SCAGspringtaller2.controllers;

import org.springframework.ui.Model;

import com.nttdata.SCAGspringtaller2.persistence.Delivery;
import com.nttdata.SCAGspringtaller2.persistence.Product;

public interface DeliveryControllerI {

	public String homeDelivery();

	public String addDelivery(final Delivery delivery);

	public String addProduct(final Product product);
	
	public String showPrices(Model model);
}
