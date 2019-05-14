package com.example.Bookstore.domain;

public class Book {

	private String title;
	private String author;
	private int year;
	private int isbn;
	private int price;
	/* Constructor with parameters */
	public Book(String title, String author, int year, int isbn, int price)
	
	{
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	
	public String getauthor() {
		return author;
	}
	public void setauthor(String auhtor, String author) {
		this.author = author;
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year = year;
	}
	public int getisbn() {
		return isbn;
	}
	public void setisbn(int isbn) {
		this.isbn = isbn;
	}
	
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	
	
}
