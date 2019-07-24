/*
 ID: joshuan3
 LANG: JAVA
 TASK: gift1
 */
import java.io.*;
import java.util.*;

public class gift1 {
	
	static Scanner in;
	static PrintWriter out;
	static int n;
	static Map<String, Integer> person;
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("gift1.in"));
			out = new PrintWriter(new File("gift1.out"));
			init();
			out.print(solve());
			in.close();
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	static void init() throws IOException{
		n = in.nextInt();
		person = new LinkedHashMap<String, Integer>();
		for(int i = 0; i < n; i++) {
			person.put(in.next(), 0);
		}
	}
	//can be string/int/boolean
	static String solve() {
		for(int i = 0; i < n; i++) {
			giftproc();
		}
		StringBuilder sb = new StringBuilder();
		for(String name:person.keySet()) {
			sb.append(name).append(" ").append(person.get(name)).append("\n");
		}
		return sb.toString();
	}

	static void giftproc() {
		String giver = in.next();
		int tm = in.nextInt();
		int receivers = in.nextInt();
		int split = 0;
		int rem = 0;
		if(receivers != 0) {
			split = tm / receivers;
			rem = tm % receivers;
		}
		else {
			split = 0;
			rem = 0;
		}
		
		person.put(giver, person.get(giver) - tm + rem);
		for(int i = 0; i < receivers; i++) {
			String name = in.next();
			person.put(name, person.get(name)+split);
		}
	}
}
