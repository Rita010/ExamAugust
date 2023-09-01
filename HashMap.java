package exam;
import java.util.HashMap;
public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 11. Define a HashMap and loop over it
		
		HashMap<String,Integer> student = new HashMap <>();
		
		student.put("rita", 22);
		student.put("laxmi", 21);
		student.put("satya", 20);
		
		System.out.println(student);
		
		
		for(String key : student.keySet()) {
			System.out.println(key);
		}
		
		for( int value : student.values()) {
			System.out.println(value);
		}
		
		
		
	}

}
