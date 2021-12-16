package com.nttdata.SCAGspringtaller2.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NTTDATA_PRODUCT")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private int productIdentifier;
	private String productName;
	private double productPriceRetail;
	private double productPriceWithoutTaxes;

	@ManyToOne
	private Delivery delivery;
	
	

	/**
	 * @param productId
	 * @param productIdentifier
	 * @param productName
	 * @param productPriceRetail
	 * @param productPriceWithoutTaxes
	 * @param delivery
	 */
	public Product(int productId, int productIdentifier, String productName, double productPriceRetail, double productPriceWithoutTaxes, Delivery delivery) {
		super();
		this.productId = productId;
		this.productIdentifier = productIdentifier;
		this.productName = productName;
		this.productPriceRetail = productPriceRetail;
		this.productPriceWithoutTaxes = productPriceWithoutTaxes;
		this.delivery = delivery;
	}
	
	public Product() {
		super();
	}



	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productIdentifier
	 */
	public int getProductIdentifier() {
		return productIdentifier;
	}

	/**
	 * @param productIdentifier
	 *            the productIdentifier to set
	 */
	public void setProductIdentifier(int productIdentifier) {
		this.productIdentifier = productIdentifier;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productPriceRetail
	 */
	public double getProductPriceRetail() {
		return productPriceRetail;
	}

	/**
	 * @param productPriceRetail
	 *            the productPriceRetail to set
	 */
	public void setProductPriceRetail(Delivery delivery) {
		if (delivery.getDeliveryCityIdentifier() == "Ceuta" || delivery.getDeliveryCityIdentifier() == "Melilla"
		        || delivery.getDeliveryCityIdentifier() == "Canarias") {
			productPriceRetail = productPriceWithoutTaxes + productPriceWithoutTaxes * 0.04;
		} else {
			productPriceRetail = productPriceWithoutTaxes + productPriceWithoutTaxes * 0.21;
		}
	}

	/**
	 * @return the productPriceWithoutTaxes
	 */
	public double getProductPriceWithoutTaxes() {
		return productPriceWithoutTaxes;
	}

	/**
	 * @param productPriceWithoutTaxes
	 *            the productPriceWithoutTaxes to set
	 */
	public void setProductPriceWithoutTaxes(double productPriceWithoutTaxes) {
		this.productPriceWithoutTaxes = productPriceWithoutTaxes;
	}

	/**
	 * @return the delivery
	 */
	public Delivery getDelivery() {
		return delivery;
	}

	/**
	 * @param delivery
	 *            the delivery to set
	 */
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

}
