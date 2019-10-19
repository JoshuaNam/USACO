import java.util.*;

public class LibraryCardTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<LibraryCard> lc = new ArrayList<LibraryCard>();
		while(true) {
			System.out.println("Choose Option 0.Print All  1.Borrow   2.Search  3.End");
			int option = in.nextInt();
			in.nextLine();
			if(option == 3) {
				System.out.println("Bye!");
				break;
			}
			
			else if(option == 1) {
				System.out.print("Input name: ");
				String name = in.nextLine();
				System.out.print("Input age: ");
				int age = in.nextInt();
				in.nextLine();
				System.out.print("Input title: ");
				String title = in.nextLine();
				System.out.print("Input ISBN: ");
				String isbn = in.nextLine();
				
				People p = new People(name, age);
				Library l = new Library(title, isbn);
				
				lc.add(new LibraryCard(p, l));
			}
			
			else if(option == 0) {
				for(LibraryCard l : lc) {
					System.out.println(l);
				}
			}
			
			else if(option == 2) {
				System.out.print("Input book title: ");
				String title = in.nextLine();
				for(int i = 0; i < lc.size(); i++) {
					String temp = lc.get(i).l.title;
					if(temp.equals(title)) {
						System.out.print(lc.get(i));
					}
				}
			}
		}
		
	}

}
