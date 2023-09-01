package exam;

public class SingleInheritanceWithConstruction {

	public static void main(String[] args) {
		
		TeacherC rita = new TeacherC("rita", "khatiwoda", "7", 5000);
		
		System.out.println(rita.firstName);
		System.out.println(rita.lastName);
		System.out.println(rita.rollNo);
		System.out.println(rita.salary);
		
		rita.displayNmae();
		rita.displaySalary();
		
		
		
	}

}
class StudentC{
	String firstName;
	String lastName;
	String rollNo;
	public StudentC(String fn, String ln, String rn) {
		this.firstName = fn;
		this.lastName = ln;
		this.rollNo = rn;
		}
	public void displayNmae() {
		System.out.println(this.firstName+this.lastName);
	}
	
}
class TeacherC extends StudentC {
	int salary;
	public TeacherC(String fn, String ln, String rn, int sy) {
		super(fn, ln, rn);
		this.salary = sy;
		
	}
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
	
	
	
}




