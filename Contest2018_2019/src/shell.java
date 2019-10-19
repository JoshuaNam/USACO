import java.io.*;
import java.util.*;
public class shell {

	static Scanner in;
	static PrintWriter out;
	static int a[],b[],c[],n,count[],shell[];
	
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
	
	private static void init() throws IOException {
		in = new Scanner(new File("shell.in"));
		out = new PrintWriter(new File("shell.out"));
		n = in.nextInt();
		a = new int[n];
		b = new int[n];
		c = new int[n];
		count = new int[4];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = in.nextInt();
		}

	}
	
	private static void solve() throws IOException {
		for(int i = 1; i < 4; i++) {
			shell = new int[4];
			count[i] = findValue(i);
		}
		Arrays.sort(count);
		out.println(count[3]);
	}
	
	static int findValue(int x) {
		int res = 0;
		shell[x] = 1;
		for(int i = 0; i < n; i++) {
			int temp = shell[a[i]];
			shell[a[i]] = shell[b[i]];
			shell[b[i]] = temp;
			if(shell[c[i]] == 1) {
				res++;
			}
		}
		return res;
	}
	

}
