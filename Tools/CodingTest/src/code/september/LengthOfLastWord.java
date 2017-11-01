package code.september;

import java.util.Scanner;

public class LengthOfLastWord {

	
	/*1. Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
	 * return the length of last word in the string. If the last word does not exist, return 0.
	*/
		
	//"hello how are you "
	
	public int strLength(String str) {
		if(str.length()==0) {
			return 0;
		}
		String[] array=str.split(" ");
		return array[array.length-1].length();
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		System.out.println(new LengthOfLastWord().strLength(str));
		
		
		
		
	}
	
	
	
}
