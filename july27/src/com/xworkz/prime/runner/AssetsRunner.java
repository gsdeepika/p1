package com.xworkz.prime.runner;
import com.xworkz.prime.app.Assets;
public class AssetsRunner {

	public static void main(String[] args) {
   System.out.println("running main in AssetsRunner");
   
   Assets assets = new Assets("investments","cash","hassan");
   Assets assets2 = new Assets("investments","cash","hassan");

  boolean result= assets.equals(assets2);
  System.out.println("assets is same: " +result);
	}

}
