package com.xworkz.prime.app;

public class DrawingBook extends Book{

	private String drawingBookName;
	private String drawingBookSize;
	
	public DrawingBook(String bookName, String bookSize, String drawingBookName, String drawingBookSize) {
		super(bookName, bookSize);
		this.drawingBookName = drawingBookName;
		this.drawingBookSize = drawingBookSize;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(" DrawingBook Name :"+drawingBookName);
		System.out.println(" DrawingBook Size :"+drawingBookSize);

	}
}
