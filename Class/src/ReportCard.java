import java.util.*;
public class ReportCard {

	static int n;
	static report a[];
	static Scanner in;
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		try {
			init();
			solve();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void init() {
		n = in.nextInt();
		a = new report[n];
		for(int i = 0; i < n; i++) {
			a[i] = new report(in.next(), in.nextInt(), in.nextInt());
		}
	}
	
	static void solve() {
		Arrays.sort(a);
		for(report r:a) {
			System.out.println(r);
		}
	}
}


class report implements Comparable<report>{
	String name;
	int eng;
	int math;
	
	report(String n, int e, int m){
		name = n;
		eng = e;
		math = m;
	}
	
	public String toString() {
		return "Name: " + name +" " + "English: " + eng + " " + "Math: " + math;
	}

	@Override
	public int compareTo(report that) {
		
		if(this.eng == that.eng) {
			if(this.math < that.math)
				return -1;
			else
				return 1;
		}
		if(this.eng < that.eng)
			return -1;
		else
			return 1;
		
	}
}
/*
 4
 a 90 100
 b 100 90
 c 85 70
 d 90 90
 */
