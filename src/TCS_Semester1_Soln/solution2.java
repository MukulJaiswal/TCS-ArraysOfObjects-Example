package TCS_Semester1_Soln;
import java.util.Scanner;

/**
 * "Create class Book with below attributes:

id - int
title - String
author - String
price - double

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - sortBooksByPrice in Solution class.
This method will take a parameter as array of Book objects. 
It will return array of books which is sorted in ascending order of book price. Assume that no two books will have same price. 

This method should be called from main method and display values of returned objects as shared in the sample. 

Before calling this method, use Scanner object to read values for four Book objects referring attributes in the above sequence. 

Next call the method and display the result. 

Consider below sample input and output:

Input:
1
hello
writer1
50
2
cup
writer2
55
3
Planet
writer3
45
4
India
writer4
40


Output (each line has values separated by single space):
4 India writer4 40.0
3 Planet writer3 45.0
1 hello writer1 50.0
2 cup writer2 55.0

Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:
22
hello

Referring below code:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -> here we expect str to have value hello. Instead it may be """".

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.

 */
class Book{
	int id;
	String title;
	String author;
	double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
}
public class solution2 {
	public static void main(String[] args) {
		int id;
		String title;
		String author;
		double price;
		Book book[] = new Book[4];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<4;i++) {
			id = sc.nextInt();sc.nextLine();
			title = sc.nextLine();
			author = sc.nextLine();
			price = sc.nextDouble();
			
			book[i] = new Book(id, title , author, price);
		}
		Book[] bk = sortBooksByPrice(book);
		for(int i=0;i<4;i++) {
			System.out.println(bk[i].getId()+ " "+ bk[i].getTitle()+ " "+bk[i].getAuthor()+ " "+bk[i].getPrice());
		}
	}
	static Book[] sortBooksByPrice(Book b[]) {
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i-1;j++) {
				if(b[j].price>b[j+1].price) {
					Book temp = b[j];
					b[j]=b[j+1];
					b[j+1]= temp;
				}
			}
		}
		
		return b;	
	}
}


















