package BFS;
import java.io.*;
import java.util.*;

public class BFS06 {
	
	static Scanner in;
	static PrintWriter out;
	static int n, m, s;
	static boolean[] v;
	static ArrayList<Integer>[] a;
	static LinkedList<Integer> q;
	
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("BFS06.in"));
			out = new PrintWriter(new File("BFS06.out"));
			init();
			out.println(solve());
			in.close();
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	static void init() throws IOException{
		n = in.nextInt();
		m = in.nextInt();
		s = in.nextInt();
		v = new boolean[n+1];
		a = new ArrayList[n+1];
		q = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i = 1; i <= m; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			a[x].add(y);
			a[y].add(x);
		}
	}
	
	static String solve() {
		return bfs(s);
	}

	static String bfs(int s) {
		v[s] = true;
		String result = "";
		q.add(s);
		while(!q.isEmpty()) {
			int n = q.poll();
			result += n + " ";
			for(int i : a[n]) {
				if(v[i])
					continue;
				v[i] = true;
				q.add(i);
			}
		}
		return result;
	}
}
