import java.util.*;
import java.io.*;
//USES ARRAYLIST INSIDE ARRAY PRETTY IMPORTANTE
public class guess {
	static Scanner in;
	static PrintWriter out;
	static int n, t[], same;
	static ArrayList<String>[] a;
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
		in = new Scanner(new File("guess.in"));
		out = new PrintWriter(new File("guess.out"));
		n = in.nextInt();
		a = new ArrayList[n];
		t = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = new ArrayList<String>();
			in.next();
			int k = in.nextInt();
			for(int j = 0; j < k; j++) {
				a[i].add(in.next());
			}
		}
	}
	
	private static void solve() throws IOException{
		same = 0;
		int max = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				for(String p: a[i]) {
					if(a[j].contains(p))
						same++;
				}
				max = Math.max(max, same);
				same = 0;
			}
		}
		out.println(++max);
	}

}
