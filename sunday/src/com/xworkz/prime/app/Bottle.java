package com.xworkz.prime.app;

public final class Bottle {
	
		private final String bottleName;
		private final int bottleSize;
		private final String bottleColor;
		
		
		public Bottle(String bottleName, int bottleSize, String bottleColor) {
			this.bottleName = bottleName;
			this.bottleSize = bottleSize;
			this.bottleColor = bottleColor;
		}
		
		public final void bottle() {
			System.out.println("Bottle Name :"+bottleName);
			System.out.println("Bottle Size :"+bottleSize);
			System.out.println("Bottle color :"+bottleColor);
			
		
	}
}
