package instancesAccessModifiers;

import java.util.*;
public class Book {

	String bookTitle;
	String bookAuthor;
	double price;
	
	public Book(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	public Book() {
        this.bookTitle = "Unknown Title";
        this.bookAuthor = "Unknown Author";
        this.price = 0.0;
    }


	public void displayBookDetails() {
		System.out.println("Title of the book: "+bookTitle);
		System.out.println("Author of the book: "+bookAuthor);
		System.out.println("Price of the book: "+price);
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Book Title: \n");
	String title=sc.next();
	System.out.print("Enter Book Author : \n");
	String author=sc.next();
	System.out.print("Enter Book Price: \n");
	double price=sc.nextDouble();
	

	
	Book book=new Book(title,author,price);
	Book book1= new Book();
	
	book.displayBookDetails();
	System.out.print("\n Displaying default Details \n");
	book1.displayBookDetails();
	}
}
