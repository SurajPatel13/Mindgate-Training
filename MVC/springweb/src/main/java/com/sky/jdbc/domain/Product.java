package com.sky.jdbc.domain;

public class Product {
private String productID;
private String productName;
private int price;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(String productID, String productName, int price) {
	this.productID = productID;
	this.productName = productName;
	this.price = price;
}
public String getProductID() {
	return productID;
}
public void setProductID(String productID) {
	this.productID = productID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + "]";
}

}
