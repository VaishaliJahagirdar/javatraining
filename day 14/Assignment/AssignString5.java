/*5
Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string 
length will be at least 2*/
public class AssignString5 {

	public static void main(String[] args) {
		String st1 = "Wipro";
		
		st1 = st1.substring(1, st1.length() - 1);
		
		System.out.println(st1);
	}

}