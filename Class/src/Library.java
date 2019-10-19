
public class Library {
	
	//data field
	String title;
	String isbn;
	
	//constructor 
	Library(String t, String i){
		title = t;
		isbn = i;
	}
	
	//method
	public String toString() {
		return "Title: " + title + "\t" + "Isbn: " + isbn;
	}
}
