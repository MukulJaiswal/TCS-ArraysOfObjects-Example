package TCS_Semester1_Soln;

import java.util.Scanner;

/**
"Create class Document with below attributes

id - int
title - String
folderName - String
pages - int

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - docsWithOddPages in Solution class.

This method will take array of Document objects and return another array with Document objects which has odd number of pages. 

This method should be called from main method and display values of returned objects as shared in the sample (in ascending order of id attribute). 

Before calling this method, use Scanner object to read values for four Document objects referring attributes in the above sequence. 

Next call the method and display the result. 

Consider below sample input and output:

Input:
1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40


Output (each line has values separated by single space):
2 question1 exams 55
3 question2 exams 45



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

"

 */
class Document1 {
	int id;
	String title;
	String folderName;
	int pages;

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

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Document1(int id, String title, String folderName, int pages) {
		super();
		this.id = id;
		this.title = title;
		this.folderName = folderName;
		this.pages = pages;
	}
}

public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		String title;
		String folderName;
		int pages;
		
		Document1[] d = new Document1[4];
		for(int i=0;i<4;i++) {
			id = sc.nextInt();sc.nextLine();
			title = sc.nextLine();
			folderName = sc.nextLine();
			pages = sc.nextInt();
			
			d[i] = new Document1(id, title, folderName, pages);
		}
		
		int id1=0;
		String title1="";
		String folderName1 = "";
		int pages1 = 0;
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<4-i-1;j++) {
//				if(d[j].id > d[j+1].id) {
//					
//					id1 = d[j].id;
//					title1 = d[j].title;
//					folderName1 = d[j].folderName;
//					pages1 = d[j].pages;
//					
//					d[j].id = d[j+1].id;
//					d[j].title = d[j+1].title;
//					d[j].folderName = d[j+1].folderName;
//					d[j].pages =  d[j+1].pages;
//					
//					d[j+1].id = id1;
//					d[j+1].title = title1;
//					d[j+1].folderName =folderName1;
//					d[j+1].pages = pages1;
//				}
//			}
//		}
		Document1 dd;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i-1;j++) {
				if(d[j].id > d[j+1].id) {
					dd = d[j];
					d[j] = d[j+1];
					d[j+1] = dd;
				}
			}
		}
		
		Document1[] docs = docsWithOddPages(d);
		for(int i=0;i<docs.length;i++)
		{
			System.out.println(docs[i].id);
			System.out.println(docs[i].title);
			System.out.println(docs[i].folderName);
			System.out.println(docs[i].pages);
			
		}
	}
	

	static Document1[] docsWithOddPages(Document1 d[]) {
		
		
		int p=0;
		
		for(int i=0;i<4;i++) {
			if(d[i].pages % 2 != 0) {
				p=p+1;
			}
		}
		
		Document1[] docs = new Document1[p];
		p=0;
		for(int i=0;i<4;i++) {
			if(d[i].pages % 2 != 0) {
				docs[p++] = new Document1(d[i].id, d[i].title, d[i].folderName , d[i].pages);
			}
		}
		
		return docs;

	}
}



















