import java.util.Scanner;

public class PeopleTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		People north[] = new People[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Input name: ");
			String name = in.nextLine();
			System.out.print("Input age: ");
			int age = in.nextInt();
			in.nextLine();
			north[i] = new People(name, age);
			
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " " + north[i]);
		}

	}

}
