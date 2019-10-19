import java.util.*;
import java.io.*;
public class blist {
	
	static Scanner in;
	static PrintWriter out;
	static int n, s, e, b, a[];
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
	//
	private static void init() throws IOException{
		in = new Scanner(new File("blist.in"));
		out = new PrintWriter(new File("blist.out"));
		n = in.nextInt();
		a = new int[1001];
		
	}
	
	private static void solve() {
		for(int i = 0; i < n; i++) {
			s = in.nextInt();
			e = in.nextInt();
			b = in.nextInt();
			
			for(int j = s; j <= e; j++)
				a[j] += b;
		}
		Arrays.sort(a);
		
		out.println(a[1000]);
	}

}
