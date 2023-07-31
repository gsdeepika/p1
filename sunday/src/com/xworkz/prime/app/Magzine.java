package com.xworkz.prime.app;

public class Magzine extends DrawingBook{

	private String magzineName;
	private String magzineSize;
	
	public Magzine(String bookName, String bookSize, String drawingBookName, String drawingBookSize, String magzineName,
			String magzineSize) {
		super(bookName, bookSize, drawingBookName, drawingBookSize);
		this.magzineName = magzineName;
		this.magzineSize = magzineSize;
	}
	
	@Override
	public void printInfo(){
		super.printInfo();
		System.out.println("Magzine Name :"+magzineName);
		System.out.println("Magzine Size :"+magzineSize);
		
	}
}
