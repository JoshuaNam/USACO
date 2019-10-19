import java.util.*;
import java.io.*;
public class paint {
	
	static Scanner in;
	static PrintWriter out;
	static int a, b, c, d;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
	private static void init() throws Exception {
		in = new Scanner(new File("paint.in"));
		out = new PrintWriter(new File("paint.out"));
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
	}

	private static void solve() throws Exception {
		int res = 0;
		//overlap condition
		if((a >= c && d >= a) || (c >= a && b >= c)) 
			res = Math.max(Math.max(a, b), Math.max(c, d)) - Math.min(Math.min(a, b), Math.min(c, d));
		else
			//no overlapping
			res = (b - a) + (d - c);
		out.print(res);
	}
}
