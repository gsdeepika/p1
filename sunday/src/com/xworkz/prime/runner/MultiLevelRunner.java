package com.xworkz.prime.runner;
import com.xworkz.prime.app.Magzine;
public class MultiLevelRunner {

	public static void main(String[] args) {
    System.out.println("Running main in Multi Level Runner");
		
    Magzine ref = new Magzine("aruns", "long", "baskar", "king", "picture magzine", "king" );
		
		ref.printInfo();

	}

}
