
public class LibraryCard {
	
	People p;
	Library l;
	
	LibraryCard(People p, Library l){
		this.p = p;
		this.l = l;
	}
	
	public String toString() {
		return p.toString() + " " + l.toString();
	}
}
