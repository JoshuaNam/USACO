/*
 ID: joshuan3
 LANG: JAVA
 TASK: test
 */
import java.io.*;
import java.util.*;

public class test {
	
	static BufferedReader in;
	static PrintWriter out;
	static int n1, n2;
	public static void main(String[] args) {
		try {
			in = new BufferedReader(new FileReader("test.in"));
			out = new PrintWriter(new File("test.out"));
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
		StringTokenizer st = new StringTokenizer(in.readLine());
		n1 = Integer.parseInt(st.nextToken());
		n2 = Integer.parseInt(st.nextToken());
	}
	//can be string/int/boolean
	static int solve() {
		return n1 + n2;
	}

}
