import java.util.Scanner;

public class LastWordInStr {
	// Given a string s consists of upper/lower-case alphabets and empty space characters 
	//' ', return the length of last word in the string. If the last word does not exist, return 0.

	public int printlastWord() {
		System.out.println("Enter a String::");
		String str=new Scanner(System.in).nextLine();
		if(str.charAt(str.length()-1)==' ') {
			return 0;
		}
		else {
			String[] str2=str.split(" ");
			return str2[str2.length-1].length();
		
		}
	}

	public static void main(String[] args) {
		System.out.println(new LastWordInStr().printlastWord());
	}
}
