package com.xworkz.prime.app;

public class DryFruit {
	private String dryFruitName;
	private String shopName;
	private String brand;
	private double price;
	private double quantity;
	private double discount;
	
	public DryFruit(String dryFruitName, String shopName, String brand, double price, double quantity,
			double discount) {
		super();
		this.dryFruitName = dryFruitName;
		this.shopName = shopName;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "dryFruitName:"+this.dryFruitName + "shopName:"+this. shopName + "brand:"+this.brand+ "price:"+this.price+ "quantity:"+this.quantity+
				"discount:"+this.discount;
	}
	
	public String getDryFruitName() {
		return dryFruitName;
	}
	
	public String getShopName() {
		return shopName;
	}
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public double getDiscount() {
		return discount;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("object is not null,can compare");
			if(obj instanceof DryFruit) {
				DryFruit casted = (DryFruit)obj;
				if(this.dryFruitName==casted.dryFruitName && this.shopName==casted.shopName && this.brand==casted.brand && this.price==casted.price && this.quantity==casted.quantity && this.discount==casted.discount){		
					
			System.out.println("both are same");
			return true;
		}
				else {
					System.err.println("both are not same");
				}
	}
			else {
				System.out.println("object is null,cannot compare");
			}
		}
		return false;
	}
}
