import java.io.*;
import java.util.*;
public class backforth {
	static Scanner in;
	static PrintWriter out;
	static String a[], b[], a1[], b1[];
	static Set<Integer> set;
	public static void main(String[] args) {
		
		try {
			init();
			solve();
			in.close();
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() throws IOException{
		in = new Scanner(new File("backforth.in"));
		out = new PrintWriter(new File("backforth.out"));
		a = new String[10];
		b = new String[10];
		a1 = new String[10];
		b1 = new String[10];
		
		a = in.nextLine().split(" ");
		b = in.nextLine().split(" ");

		a1 = a.clone();
		b1 = b.clone();
		//doesnt allow duplicates
		set = new HashSet<Integer>();
		
	}
	
	private static void solve() throws IOException{
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				a = a1.clone();
				b = b1.clone();
				int milk = 1000 - Integer.parseInt(a[i]) + Integer.parseInt(b[j]);
				a[i] = b[j];
				b[j] = a1[i];
				
				for(int k = 0; k < 10; k++) {
					for(int s = 0; s < 10; s++) {
						int res = milk - Integer.parseInt(a[k]) + Integer.parseInt(b[s]);
						set.add(res);
					}
				}
			}
		}
		out.println(set.size());
		out.close();
	}
	
	
}

