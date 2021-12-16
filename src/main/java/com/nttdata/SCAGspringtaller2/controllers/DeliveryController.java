package com.nttdata.SCAGspringtaller2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.SCAGspringtaller2.persistence.Delivery;
import com.nttdata.SCAGspringtaller2.persistence.Product;
import com.nttdata.SCAGspringtaller2.services.DeliveryServiceI;
import com.nttdata.SCAGspringtaller2.services.ProductServiceI;

@Controller
@RequestMapping("/home/")
public class DeliveryController implements DeliveryControllerI{

	@Autowired
	private DeliveryServiceI deliveryService;
	
	@Autowired
	private ProductServiceI productService;
	
	@Override
	@GetMapping()
	public String homeDelivery() {
		return "/home";
	}

	@Override
	@PostMapping("/addDelivery")
	public String addDelivery(Delivery delivery) {
		String viewResult = "errorsV";

		delivery = deliveryService.addDelivery(delivery);

		if (delivery != null) {
			viewResult = "/home";
		}

		return viewResult;
	}

	@Override
	@PostMapping("/addProduct")
	public String addProduct(Product product) {
		String viewResult = "errorsV";

		product = productService.addProduct(product);

		if (product != null) {
			viewResult = "/home";
		}

		return viewResult;
	}

	@Override
	@GetMapping("/showPrices")
	public String showPrices(Model model) {
		String viewResult = "pricesListView";

		final List<Product> result =productService.getAllProducts();
		
		model.addAttribute("productsList", result);

		return viewResult;
	}

}
