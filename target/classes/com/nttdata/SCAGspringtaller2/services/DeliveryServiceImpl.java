package com.nttdata.SCAGspringtaller2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.SCAGspringtaller2.persistence.Delivery;
import com.nttdata.SCAGspringtaller2.persistence.DeliveryRepositoryI;

@Service
public class DeliveryServiceImpl implements DeliveryServiceI {

	@Autowired
	private DeliveryRepositoryI deliveryRepositoryI;
	
	@Override
	public Delivery addDelivery(Delivery newDelivery) {
		deliveryRepositoryI.save(newDelivery);
		
		return newDelivery;
	}
}
