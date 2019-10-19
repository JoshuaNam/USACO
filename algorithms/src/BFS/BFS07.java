package BFS;
import java.io.*;
import java.util.*;

public class BFS07 {
	
	static Scanner in;
	static PrintWriter out;
	static int curr, goal;
	static Queue<Integer> q;
	static boolean[] v;
	static int[] arr;
	static int[] change = {1, -1, curr};
	
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("BFS07.in"));
			out = new PrintWriter(new File("BFS07.out"));
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
		q = new LinkedList<Integer>();
		v = new boolean[100000];
		curr = in.nextInt();
		goal = in.nextInt();
		arr = new int[100000];
		q.add(curr);
	}
	//can be string/int/boolean
	static int solve() {
		BFSMethod();
		return arr[goal];
	}

	static void BFSMethod() {
		v[curr] = true;
		while(!q.isEmpty()) {
			int a = q.poll();
			int p1 = a + 1;
			int p2 = a - 1;
			int p3 = a*2;
			
			
			if(p1 >= 0 && p1 <= 100000 && arr[p1] == 0 && v[p1] == false) {
				q.add(p1);
				arr[p1] = arr[a] + 1;
				v[p1] = true;
			}
			
			
			if(p2 >= 0 && p2 <= 100000 && arr[p2] == 0 && v[p2] == false) {
				q.add(p2);
				arr[p2] = arr[a] + 1;
				v[p2] = true;
			}
		
			if(p3 >= 0 && p3 <= 100000 && arr[p3] == 0 && v[p3] == false) {
				q.add(p3);
				arr[p3] = arr[a] + 1;
				v[p3] = true;
			}
			
			if(p1 == goal || p2 == goal || p3 == goal)
				break;
			}
		
		}
	
}
