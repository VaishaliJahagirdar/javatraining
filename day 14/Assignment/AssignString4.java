/*4
Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the 
string length is odd number then return null*/
public class AssignString4 {

	public static void main(String[] args) {
		String str = "CatDog";
		
		String output;
		
		if (str.length() % 2 == 0) {
			output = str.substring(0, str.length() / 2);
		} else {
			output = null;
		}
		
		System.out.println(output);
	}

}