package com.autowire;

public class Categories {
	private String name;
	private Book bk;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	public void bookDetails() {
		System.out.println("Category name: "+name);
		System.out.println("Book Name " +bk.getBookname()+ "Book Price " +bk.getBookprice());
	}
	

}
