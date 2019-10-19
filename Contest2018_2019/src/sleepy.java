import java.util.*;
import java.io.*;
public class sleepy {
	
	static Scanner in;
	static PrintWriter out;
	static int n, ans, a[];
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
	
	private static void init() throws IOException{
		in = new Scanner(new File("sleepy.in"));
		out = new PrintWriter(new File("sleepy.out"));
		n = in.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
	}
	
	private static void solve() throws IOException{
		for(int i = n - 1; i > 0; i--) {
			if(a[i-1] > a[i]) {
				ans = i;
				break;
			}
		}
		out.println(ans);
	}

}
