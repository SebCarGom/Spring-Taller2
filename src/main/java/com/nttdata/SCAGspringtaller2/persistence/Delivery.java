package com.nttdata.SCAGspringtaller2.persistence;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NTTDATA_DELIVERY")
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deliveryId;
	private int deliveryIdentifier;
	private String deliveryAddressee;
	private String deliveryAddress;
	private String deliveryCityIdentifier;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "delivery")
	private List<Product> productList;

	/**
	 * @return the deliveryId
	 */
	public int getDeliveryId() {
		return deliveryId;
	}

	/**
	 * @param deliveryId
	 *            the deliveryId to set
	 */
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	/**
	 * @return the deliveryIdentifier
	 */
	public int getDeliveryIdentifier() {
		return deliveryIdentifier;
	}

	/**
	 * @param deliveryIdentifier
	 *            the deliveryIdentifier to set
	 */
	public void setDeliveryIdentifier(int deliveryIdentifier) {
		this.deliveryIdentifier = deliveryIdentifier;
	}

	/**
	 * @return the deliveryAddressee
	 */
	public String getDeliveryAddressee() {
		return deliveryAddressee;
	}

	/**
	 * @param deliveryAddressee
	 *            the deliveryAddressee to set
	 */
	public void setDeliveryAddressee(String deliveryAddressee) {
		this.deliveryAddressee = deliveryAddressee;
	}

	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * @param deliveryAddress
	 *            the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * @return the deliveryCityIdentifier
	 */
	public String getDeliveryCityIdentifier() {
		return deliveryCityIdentifier;
	}

	/**
	 * @param deliveryCityIdentifier
	 *            the deliveryCityIdentifier to set
	 */
	public void setDeliveryCityIdentifier(String deliveryCityIdentifier) {
		this.deliveryCityIdentifier = deliveryCityIdentifier;
	}

	/**
	 * @return the productList
	 */
	public List<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList
	 *            the productList to set
	 */
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
