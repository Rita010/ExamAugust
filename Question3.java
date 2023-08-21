package exam;

public class Question3 {

	public static void main(String[] args) {
		
	// 1. Define a two classes with inheritance
	
		Son romi = new Son("Bishnu", "khatiwada", "Mohan", "Romi");
		romi.displayFullName();  
		romi.displaysfullName();
		
		Father mohan = new Father("Bishnu", "khatiwada", "Mohan");
		mohan.displayFullName();
		mohan.displayffullname();
		
	}

}
class Grandfather{
	String firstName;
	String lastName;
	public Grandfather(String fn, String ln) {
		this.firstName= fn;
		this.lastName= ln;
	}
	public void displayFullName() {
		System.out.println(this.firstName+ this.lastName);
	}
	
}
class Father extends Grandfather{
	
	String ffirstName;
	public Father(String fn, String ln, String ffn) {
		super(fn, ln);
		this.ffirstName= ffn;
	}
	public void displayffullname() {
		System.out.println(this.ffirstName+this.lastName);
	}
}
class Son extends Father{

	String sfirstName;
	public Son(String fn, String ln, String ffn, String sfn) {
		super(fn, ln, ffn);
		this.sfirstName= sfn;
	}
	public void displaysfullName() {
		System.out.println(this.sfirstName+this.lastName);
	}
}