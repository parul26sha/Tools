package code.august;

import java.util.Scanner;

public class Palindrome {

	
	/* Given a string , you are allowed to convert it to a palindrome by adding characters in front of it.
	 *  Find and return the shortest palindrome you can find by performing this transformation.
	 *  For example, given "aacecaaa", return "aaacecaaa"; given "abcd", return "dcbabcd".*/
	
	
	public boolean checkPalindrom(String str) {
		
		for(int i=0,j=str.length()-1;i<str.length()&&j>=0;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		return true;
		
	}
	public String shortestPalindrom(String str) {
		if(checkPalindrom(str)) {
			return str;
		}
		int index=0;
		String newStr="";
		StringBuffer buffer=new StringBuffer(str);
		
		for(int i=str.length()-1;i>=0;i--) {
			buffer.insert(index,str.charAt(i));
			if(checkPalindrom(buffer.toString())) {
				newStr+=buffer.toString();
				break;
			}
			else {
				index++;
			}
		}
		return newStr;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string::");
		Scanner scanner=new Scanner(System.in);
		
		String str=(new Palindrome().shortestPalindrom(scanner.nextLine()));
		System.out.println(str);
	}



}

