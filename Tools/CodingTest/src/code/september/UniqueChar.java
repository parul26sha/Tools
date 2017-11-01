package code.september;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
	//How To Determine If String Has All Unique Characters
	
	public boolean uniqueChar() {
		System.out.println("Enter a string::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		str=str.trim();
		char[] strArr=str.toCharArray();
		Set<Character> set=new HashSet<Character>();
		for(Character c:strArr) {
			set.add(c);
		}
		
		return str.length()==set.size();
	}
	
	public static void main(String[] args) {
		
		System.out.println("The entered string holds unique value:: "+ new UniqueChar().uniqueChar());
		
	}
	

}
