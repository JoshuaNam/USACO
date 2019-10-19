package BFS;
import java.io.*;
import java.util.*;

public class BFS01 {
	
	static Scanner in;
	static PrintWriter out;
	static Queue<Integer> q;
	static int[][] arr;
	static int n;
	static int m;
	static int count;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("BFS01.in"));
			out = new PrintWriter(new File("BFS01.out"));
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
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 1) {
					BFSMethod(i, j);
					count++;
				}
			}
		}
		return count;
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
			}
		}
	}
	
}