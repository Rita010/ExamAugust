package exam;

public class Hierarchical {

	public static void main(String[] args) {
		
		SonA romi = new SonA("sardha", "khatiwoda", "romi");
		Daughter rita = new Daughter("sardha", "khatiwoda", "rita");
		
		System.out.println(romi.firstName);
		System.out.println(romi.lastName);
		System.out.println(romi.sname);
		
		romi.displayMName();
		romi.displaySName();
		
		System.out.println(rita.firstName);
		System.out.println(rita.lastName);
		System.out.println(rita.dname);
		
		rita.displayMName();
		rita.displayDName();
	}

}
class Mother{
	String firstName;
	String lastName;
	
	public Mother(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void displayMName() {
		System.out.println(this.firstName+this.lastName);
	}
	
}
class SonA extends Mother{
	String sname;
	
	public SonA(String fn, String ln, String sn) {
		super(fn, ln);
		this.sname = sn;
	}
	public void displaySName() {
		System.out.println(this.sname+this.lastName);
	}

}
class Daughter extends Mother{
	String dname;
	
	public Daughter(String fn, String ln, String dn) {
		super(fn, ln);
		this.dname = dn;
	}
	public void displayDName() {
		System.out.println(this.dname+this.lastName);
	}
}
