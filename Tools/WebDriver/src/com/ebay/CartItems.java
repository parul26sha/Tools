package com.ebay;

public class CartItems {
	protected String productName;
	protected float price;
	protected int quantity;
	protected String status;
	public CartItems(String productName, float price, int quantity, String status) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.status = status;
	}
	
}
