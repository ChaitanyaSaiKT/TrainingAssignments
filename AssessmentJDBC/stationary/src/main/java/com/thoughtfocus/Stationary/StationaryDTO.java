package com.thoughtfocus.Stationary;

public class StationaryDTO {

	private String name;
	private double price;
	private String type;
	private int quantity;
	private String brandname;
	private int serialnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}
	@Override
	public String toString() {
		return "StationaryDTO [name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity
				+ ", brandname=" + brandname + ", serialnumber=" + serialnumber + "]";
	}
	
	
}
