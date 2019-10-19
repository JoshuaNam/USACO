import java.util.*;
import java.io.*;
public class square {
	static Scanner in;
	static PrintWriter out;
	static int s1[], s2[], max, h, l;
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
		in = new Scanner(new File("square.in"));
		out = new PrintWriter(new File("square.out"));
		s1 = new int[4];
		s2 = new int[4];
		for(int i = 0; i < 4; i++) {
			s1[i] = in.nextInt();
		}
		for(int i = 0; i < 4; i++) {
			s2[i] = in.nextInt();
		}
	}
	
	private static void solve() throws IOException{
		h = Math.max(Math.max(s2[1], s2[3]), Math.max(s1[1], s1[3])) - Math.min(Math.min(s2[1], s2[3]), Math.min(s1[1], s1[3]));
		l = Math.max(Math.max(s2[0], s2[2]), Math.max(s1[0], s1[2])) - Math.min(Math.min(s2[0], s2[2]), Math.min(s1[0], s1[2]));
		max = Math.max(h, l);
		out.println(max*max);
	}

}
