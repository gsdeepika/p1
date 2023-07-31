package com.xworkz.prime.runner;
import com.xworkz.prime.app.BedSheet;
import com.xworkz.prime.app.Bed;
import com.xworkz.prime.app.Pillow;
public class HierarchyRunner {

	public static void main(String[] args) {
System.out.println("Running main in Hierarchy Runner");
		
Bed BedSheet = new BedSheet("bunk bed", "red", "pink", 500);
		HierarchyRunner.show(BedSheet);
		
		System.out.println("running main");
		
		Bed Pillow = new Pillow("bunk bed", "red", "orange", 1500);
		HierarchyRunner.show(Pillow);

	}
	public static void show(Bed bed){
		if(bed!= null) {
			
			if(bed instanceof BedSheet) {
				BedSheet bedSheet = (BedSheet)bed;
				bedSheet.printInfo();
				}
			
			 if(bed instanceof Pillow) {
				Pillow pillow = (Pillow)bed;
				pillow.printInfo();
			}
		}
		else {
		System.err.println("Object is null ");
		}
	}
}
