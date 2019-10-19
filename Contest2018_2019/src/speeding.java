import java.util.*;
import java.io.*;
public class speeding {
	
	static Scanner in;
	static PrintWriter out;
	static int n, m, max, road[], cow[];
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
		in = new Scanner(new File("speeding.in"));
		out = new PrintWriter(new File("speeding.out"));
		n = in.nextInt();
		m = in.nextInt();
		max = 0;
		road = new int[100];
		cow = new int[100];
		int x = 0;
		int prevx = 0;
		for(int i = 0; i < n; i++) {
			prevx = x;
			x += in.nextInt();
			int tempy = in.nextInt();
			for(int j = prevx; j < x; j++) {
				road[j] = tempy;
			}
		}
		x = 0;
		prevx = 0;
		for(int i = 0; i < m; i++) {
			prevx = x;
			x += in.nextInt();
			int tempy = in.nextInt();
			for(int j = prevx; j < x; j++) {
				cow[j] = tempy;
			}
		}
		//System.out.println(Arrays.toString(road));
		//System.out.println(Arrays.toString(cow));
	}

	private static void solve() throws IOException{
		for(int i = 0; i < 100; i++) {
			if(cow[i] > road[i])
				max = Math.max(cow[i] - road[i], max);
		}
		out.print(max);
	}
}
