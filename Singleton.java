package exam;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 2. Singleton Pattern
		
		Database db = Database.getInstance();
		db.getConnectiion();
		
		
	}

}
class Database{
	private static Database dbObject = null;
	private Database() {
		
	}
	public static Database getInstance() {
		if (dbObject==null) {
			dbObject=new Database();
			
		}
		return dbObject;
	}
	public void getConnectiion() {
		System.out.println("you are successfully connected to database");
	}
}




