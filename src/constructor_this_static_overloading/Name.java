package constructor_this_static_overloading;
//Should create a Class Document,
//with Parameters Id, title, folderName, pages.
//Four document inputs are given, And
//The Output must be The Combination of All input documents
//Output: Id should be 1 more than Total Inputs
//Titles are separated by #
//FolderNames are Separated by @
//Pages should be total count  of all pages

/**
 * Want to create class Document in that the attributes are id,title,firstname and page
Then in class solution want to create four object for class document .
Then in want write function which get obj array as input and return another obj..in that func we want manipulte these..
id as max id+1 
Title as concate all obj title with # symbol inbetween
Firstname as concatevall 1st name with @ symbol inbetween
Page as total of all page
 * @author Mukul
 *
 */
class Document {
	int id;
	String title;
	String folderName;
	int  pages;
	
	
	public Document(int id, String title, String folderName, int pages) {
		this.id = id;
		this.title = title;
		this.folderName = folderName;
		this.pages = pages;
	}
	
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
}

public class Name
{
	public static void main(String[] args) {
		
		Document ob = new Document(0, null, null, 0);
	}
}













