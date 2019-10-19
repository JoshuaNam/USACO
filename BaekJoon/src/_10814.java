import java.util.*;
public class _10814 {

	static Scanner in;
	static jersey people[];
	static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			init();
			System.out.println(solve());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	static void init() {
		in = new Scanner(System.in);
		n = in.nextInt();
		people = new jersey[n];
		for(int i = 0; i < n; i++) {
			people[i] = new jersey(in.nextInt(), in.next(), i);
		}
	}
	
	static String solve() {
		Arrays.sort(people);
		String result = "";
		for(jersey j: people) {
			result += j.age + " " + j.name + "\n";
		}
		return result;
	}
}

class jersey implements Comparable<jersey>{
	String name;
	int order;
	int age;
	
	jersey(int a, String n, int o){
		name = n;
		order = o;
		age = a;
	}
	
	public String toString() {
		return age + " " + name;
	}

	@Override
	public int compareTo(jersey that) {
		if(this.age == that.age) {
			if(this.order < that.order)
				return -1;
			else
				return 1;
		}
		else if(this.age < that.age)
			return -1;
		else
			return 1;
	}
}