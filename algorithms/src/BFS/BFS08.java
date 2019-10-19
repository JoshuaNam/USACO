package BFS;
import java.io.*;
import java.util.*;

public class BFS08 {
	
	static Scanner in;
	static PrintWriter out;
	static Queue<Integer> q;
	static int[][] arr;
	static int n, m, k;
	static int count;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int curr;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("BFS08.in"));
			out = new PrintWriter(new File("BFS08.out"));
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
		k = in.nextInt();
		list = new ArrayList<Integer>();
		arr = new int[n][m];
		//have to take in the three islands
		for(int h = 0; h < k; h++) {
			int ya = in.nextInt();
			int xa = in.nextInt();
			int yb = in.nextInt();
			int xb = in.nextInt();
			for(int i = xa; i < xb; i++) {
				for(int j = ya; j < yb; j++) {
					arr[i][j] = 1;
				}
			}
		}
		
	}
	//can be string/int/boolean
	static String solve() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 0) {
					list.add(BFSMethod(i, j));
					count++;
				}
			}
		}
		Collections.sort(list);
		String res = count + "" + "\n";
		for(int i = 0; i < list.size(); i++) {
			res += list.get(i) + "" + " ";
		}
		return res;
	}
	
	static int BFSMethod(int i, int j) {
		q.add(i);
		q.add(j);
		int sizea = 1;
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();
			for(int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				if(nx < 0 || ny < 0 || nx >= n || ny >= m)
					continue;
				if(arr[nx][ny] == 1)
					continue;
				q.add(nx);
				q.add(ny);
				arr[nx][ny] = 1;
				sizea++;
			}
		}
		if(sizea > 1)
			sizea--;
		return sizea;
	}

}
