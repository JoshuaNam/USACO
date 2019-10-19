
public class LibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Library b1 = new Library("Little Prince", "123-BN-57");
		Library b2 = new Library("Wimpy Kid", "345-AB-90");
		
		System.out.println(b1);
		b1.isbn = "124-BN-57";
		System.out.println(b1);
	}

}
