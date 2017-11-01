package code.august;

import java.util.Scanner;

public class RemoveVowels {
	
	/*
	 * WAP to enter the String then remove vowels from the string
	 * Niraj kumar: eg input-Niraj
	 * o/p-Nrj

	 */

	public void remove(String str) {
		StringBuffer buffer= new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=Character.toLowerCase(str.charAt(i));
			if(ch!='a' && ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				buffer.append(str.charAt(i));
			}
		}
		
		System.out.println(buffer.toString());
	
	
	}
	
	public static void main(String[] args) {
		System.out.println("Remove vowels from the following String::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		new RemoveVowels().remove(str);
		
	
	}
	
	
}
