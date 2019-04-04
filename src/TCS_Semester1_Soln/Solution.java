package TCS_Semester1_Soln;

import java.util.Scanner;

/***
 * " Create class Document with below attributes id - int title - String
 * folderName - String pages - int
 * 
 * Write getters, setters and parameterized constructor as required.  
 * 
 * Create class Solution with main method. 
 * 
 * Implement static method - combineDocs in Solution class.
 * 
 * This method will take array of Document objects and return another document
 * object which will be combinition of all objects in array.
 * 
 * The logic for combining each attribute will be as below:
 * 
 * id - this value will be 1 more than maximum value of id in object array.
 * title - this value will be concatanation of title values of all objects in
 * the array (separated by #).  folderName - this value will be concatanation of
 * folderName values of all objects in the array (separated by @) pages - this
 * value will be total of page values in the object array.  
 * 
 * This method should be called from main method and display values of returned
 * object as shared in the sample.
 * 
 * Before calling this method, use Scanner object to read values for four
 * Document objects referring attributes in the above sequence. 
 * 
 * Next call the method and display the result. 
 * 
 * Consider below sample input and output:
 * 
 * Input: 1 resume personal 50 2 question1 exams 55 3 question2 exams 45 4 India
 * misc 40
 * 
 * 
 * Output: 5 resume#question1#question2#India personal@exams@exams@misc 190
 * 
 * Note on using Scanner object: Sometimes scanner does not read the new line
 * character while invoking methods like nextInt(), nextDouble() etc.  Usually,
 * this is not an issue, but this may be visible while calling nextLine()
 * immediately after those methods.
 * 
 * Consider below input values: 22 hello
 * 
 * Referring below code:
 * 
 * Scanner sc = new Scanner(System.in); int x = sc.nextInt(); String str =
 * sc.nextLine(); -> here we expect str to have value hello. Instead it may be
 * """".
 * 
 * If above issue is observed, then it is suggested to add one more explicit
 * call to nextLine() after reading numeric value.
 * 
 * 
 */
class Document {
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

	public Document(int id,String title, String folderName, int pages) {
		super();
		this.id = id;
		this.title = title;
		this.folderName = folderName;
		this.pages = pages;
	}
}

class Solution {
	public static void main(String[] args) {
		
		int id;
		String title;
		String folderName;
		int pages;
		
		Document1 d[] = new Document1[4];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			id = sc.nextInt();sc.nextLine();
			title = sc.nextLine();
			folderName = sc.nextLine();
			pages = sc.nextInt();
			
			d[i] = new Document1(id,title,folderName,pages);
		}
		
		Document1 doc = combineDocs(d);
		System.out.println(doc.id);
		System.out.println(doc.title);
		System.out.println(doc.folderName);
		System.out.println(doc.pages);
	}
	static Document1 combineDocs(Document1[] d) {
		
		int id=0;
		String title ="";
		String folderName="";
		int pages=0;
		id = ++d[d.length-1].id;
		for(int i=0;i<d.length;i++) {
			if(i<d.length-1) {
			title = title + d[i].getTitle() + "#";	
			folderName = folderName + d[i].getFolderName() + "@";
			pages = pages + d[i].pages;
			}
			else {
				title = title + d[i].getTitle() ;	
				folderName = folderName + d[i].getFolderName();
				pages = pages + d[i].pages;
			}
		}
		Document1 doc = new Document1(id,title,folderName,pages);
		
		return doc;
	}
}
















