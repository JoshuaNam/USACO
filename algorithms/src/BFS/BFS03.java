package BFS;
import java.io.*;
import java.util.*;

public class BFS03 {
	
	static Scanner in;
	static PrintWriter out;
	static Queue<Integer> q;
	static int[][] arr;
	static int n;
	static int m;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int max;
	static int curr;
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("BFS03.in"));
			out = new PrintWriter(new File("BFS03.out"));
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
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
	}
	static int solve() {
		max = 0;
		curr = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 1) {
					BFSMethod(i, j);
				curr = 0;
				}
			}
		}
		return max;
	}

	static void BFSMethod(int i, int j) {
		q.add(i);
		q.add(j);
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();
			for(int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if(nx < 0 || ny < 0 || nx >= n || ny >= m)
					continue;
				if(arr[nx][ny] == 0)
					continue;
				q.add(nx);
				q.add(ny);
				arr[nx][ny] = 0;
				curr++;
			}
		}
		if(curr > max)
			max = curr;
	}
}
