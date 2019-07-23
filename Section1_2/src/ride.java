/*
 ID: joshuan3
 LANG: JAVA
 TASK: ride
 */
import java.io.*;
import java.util.*;

public class ride {
	
	static BufferedReader in;
	static PrintWriter out;
	static String n1, n2;
	public static void main(String[] args) {
		try {
			in = new BufferedReader(new FileReader("ride.in"));
			out = new PrintWriter(new File("ride.out"));
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
		n1 = in.readLine();
		n2 = in.readLine();
	}
	//can be string/int/boolean
	static String solve() {
		if(conv(n1) == conv(n2))
			return "GO";
		else
			return "STAY";
	}
	
	static int conv(String s) {
		int res = 1;
		for(int i = 0; i < s.length(); i++) {
			res = res * (s.charAt(i) - 'A' + 1);
		}
		return res % 47;
	}
}
