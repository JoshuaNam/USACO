
public class People {
	
	//data field
	String name;
	int age;
	
	//default constructor 
	People(){
		name = "";
		age = 0;
	}
	
	
	//regular constructor
	People(String n, int a){
		name = n;
		age = a;
	}
	
	//methods
	public String toString() {
		return "NAME: " + name + "\t" + "AGE: " + age + "\t";
	}
}
