package com.xworkz.prime.app;

public class Book {
	private String bookName;
	private String bookSize;
	
	public Book(String bookName, String bookSize) {
		this.bookName = bookName;
		this.bookSize = bookSize;
	}

	public void printInfo() {
		System.out.println("Book Name :"+bookName);
		System.out.println("Book Size :"+bookSize);
	}
}
