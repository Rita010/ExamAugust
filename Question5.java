package exam;

public class Question5 {

	public static void main(String[] args) {

		//5. Define example of overridding

		
		NIB bank = new NIB("Nepal", "Baneshwor");
		bank.displayMessage();
		bank.loan();
		bank.save();
		
		
	}

}
class WorldBank{
	String kathmandu;
	public WorldBank(String ktm) {
		this.kathmandu=ktm;
	}
	public void loan() {
		System.out.println("This is loan from worldbank");
	}
	public void save() {
		System.out.println("This is save from worldbank");
	}
	public void displayMessage(){
		System.out.println("Welcome to worldbank");
	}
	
}
class CivilBank extends WorldBank{
	String branchName;
	public CivilBank(String ktm, String bn) {
		super(ktm);
		this.branchName=bn;
	}
	public void loan() {
		System.out.println("this is loan from Civilbank");
	}
	public void save() {
		System.out.println("this is save from Civilbank");
	}
	
}
class NIB extends WorldBank{
		String branchName;
	public NIB(String ktm, String bnn) {
		super(ktm);
		this.branchName=bnn;
		
	}
	public void loan() {
		System.out.println("this is loan from NIB");
	}
	public void save() {
		System.out.println("this is save from NIB");
	}
	
	
}



