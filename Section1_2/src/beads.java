/*
 ID: joshuan3
 LANG: JAVA
 TASK: beads
 */
import java.io.*;
import java.util.*;

public class beads {
	
	static Scanner in;
	static PrintWriter out;
	static int max;
	static int n;
	static String inp;
	static int count;
	static char sp;
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("beads.in"));
			out = new PrintWriter(new File("beads.out"));
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
		inp = in.next();
	}
	//can be string/int/boolean
	static int solve() {
		max = 0;
		count = 0;
		int temp = 0;
		inp = inp + inp;
		for(int i = 0; i < n; i++) {
			sp = inp.charAt(i);
			if(sp == 'w') {
				sp = 'r';
				int temp1 = count(i);
				sp = 'b';
				int temp2 = count(i);
				temp = Math.max(temp1, temp2);
			}else
				temp = count(i);
			if(temp > max)
				max = temp;
		}
		return max;
	}
	
	static int count(int start) {
		int c = 0;
		int count = 0;
		for(int i = start; i < start + n; i++) {
			if(isDiff(inp.charAt(i))) {
				c++;
				sp = inp.charAt(i);
			}
			if(c == 2) 
				break;
			count++;
		}
		return count;
	}
	
	static boolean isDiff(char a) {
		if(sp == a || a == 'w')
			return false;
		else
			return true;
	}
}
