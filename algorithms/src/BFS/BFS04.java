package BFS;
import java.io.*;
import java.util.*;

public class BFS04 {
	
	static Scanner in;
	static PrintWriter out;
	static Queue<Integer> q;
	static int[][] arr;
	static int n;
	static int m;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int days;
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("BFS04.in"));
			out = new PrintWriter(new File("BFS04.out"));
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
		m = in.nextInt();
		n = in.nextInt();
		arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = in.nextInt();
				if(arr[i][j] == 1) {
					q.add(i);
					q.add(j);
				}
			}
		}
	}
	//can be string/int/boolean
	static int solve() {
		BFSMethod();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 0)
					return -1;
				if(arr[i][j] > days)
					days = arr[i][j];
			}
		}
		return days-1;
	}

	static void BFSMethod() {
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();
			for(int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if(nx < 0 || ny < 0 || nx >= n || ny >= m)
					continue;
				if(arr[nx][ny] == 0) {
					q.add(nx);
					q.add(ny);
					arr[nx][ny] = arr[x][y]+1;
				}
				
			}
		}
	}
}
