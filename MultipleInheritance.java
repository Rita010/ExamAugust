package exam;

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Son romi = new Son("bishnu", "khatiwoda", "mohan", "romi");
		
		System.out.println(romi.firstName);
		System.out.println(romi.lastName);
		System.out.println(romi.fname);
		System.out.println(romi.sname);
		
		romi.displayGName();
		romi.displayFName();
		romi.displaySName();
		
	}

}
class Grandfater{
	String firstName;
	String lastName;
	
	public Grandfater(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;	
	}
	public void displayGName() {
		System.out.println(this.firstName+this.lastName);
	}
	
}
class Father extends Grandfater{
	String fname;
	
	public Father(String fn, String ln, String ffn) {
		super(fn, ln);
		this.fname = ffn;
	}
	public void displayFName() {
		System.out.println(this.fname+this.lastName);
	}
	
}
class Son extends Father{
	String sname;
	
	public Son(String fn, String ln, String ffn, String sn) {
		super(fn, ln, ffn);
		this.sname = sn;
	}
	public void displaySName() {
		System.out.println(this.sname+this.lastName);
	}
}