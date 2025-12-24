// package classesandobjects;
import java.util.*;
public class BookDetailes {

	String bookTitle;
	String bookAuthor;
	double price;
	
	public BookDetailes(String bookTitle,String bookAuthor,double price){
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.price=price;
	}
	
	//creating the method to display the output
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
	
	BookDetailes book=new BookDetailes(title,author,price);
	
	book.displayBookDetails();
	}
}
