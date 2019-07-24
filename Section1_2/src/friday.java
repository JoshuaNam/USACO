/*
 ID: joshuan3
 LANG: JAVA
 TASK: friday
 */
import java.io.*;
import java.util.*;

public class friday {
	
	static Scanner in;
	static PrintWriter out;
	static int year = 1900;
	static int day = 13;
	static int[] dow;
	static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int num;
	public static void main(String[] args) {
		try {
			in = new Scanner(new FileReader("friday.in"));
			out = new PrintWriter(new File("friday.out"));
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
		num = in.nextInt();
		dow = new int[7];
	}
	
	//can be string/int/boolean
	static String solve() {
		String re;
		for(int j = 1900; j < 1900 + num; j++) {
			for(int i = 1; i <= 12; i++) {
				dow[day % 7]++;
				day += month[i];
				if(i == 2 && isLeap(j))
					day++;
			}
		}
		re = dow[6] + "";
		for(int i = 0; i <= 5; i++) {
			re += " " + dow[i];
		}
		return re;
	}
	
	static boolean isLeap(int a) {
		if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0))
			return true;
		else
			return false;
	}
}
