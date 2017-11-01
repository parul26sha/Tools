package code.august;

import java.util.Scanner;

public class ReverseString {
	
	/*
	 * WAP to enter the sentence then print it in reverse order
	 */
	
	public void reverseStr() {
		System.out.println("Enter a string::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		StringBuffer buffer=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			buffer.append(str.charAt(i));
		}
		
		System.out.println("Reverse String:: "+buffer.toString());
		
	}
	
	/*
	 *  WAP to enter a sentence then find 2 last word of sentence
	 */
	public String secondLastWord() {
		
		System.out.println("Enter a string::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		String[] stringArray=str.split(" ");
		if(stringArray.length==1) {
			return ("Only one Word in the string!");
		}
		else {
			return stringArray[stringArray.length-2];
		}
		
	}
	
	
	public static void main(String[] args) {
		new ReverseString().reverseStr();
		System.out.println("-----------------");
		System.out.println(new ReverseString().secondLastWord());
		
		
	}

}
