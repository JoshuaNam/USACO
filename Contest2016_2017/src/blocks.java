import java.util.*;
import java.io.*;
public class blocks {
	static Scanner in;
	static PrintWriter out;
	static String fin;
	static int n, alph[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			init();
			solve();
			in.close();
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() throws IOException{
		in = new Scanner(new File("blocks.in"));
		out = new PrintWriter(new File("blocks.out"));
		n = in.nextInt();
		fin = "";
		alph = new int[26];
		for(int i = 0; i < n; i++) {
			String first = in.next();
			String second = in.next();
			for(int j = 0; j < first.length(); j++) {
				for(int k = 0; k < second.length(); k++) {
					if((first.charAt(j)+"").equals(second.charAt(k)+"")) {
						fin += first.charAt(j);
						first = first.replaceFirst(first.charAt(j)+"", "-");
						second = second.replaceFirst(second.charAt(k)+"", "+");
						//System.out.println(first + " " + second);
					}
				}
			}
			for(int j = 0; j < first.length(); j++) {
				if(first.charAt(j) - 'a' >= 0 && first.charAt(j) - 'a' <= 25)
					fin += first.charAt(j);
			}
			for(int j = 0; j < second.length(); j++) {
				if(second.charAt(j) - 'a' >= 0 && second.charAt(j) - 'a' <= 25)
					fin += second.charAt(j);
			}
		}
		//System.out.println(fin);
	}
	
	private static void solve() throws IOException{
		for(int i = 0; i < fin.length(); i++) {
			alph[fin.charAt(i) - 'a']++;
		}
		for(int i = 0; i < 26; i++) {
			out.println(alph[i]);
		}
	} 

}
