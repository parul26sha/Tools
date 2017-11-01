	package code.august;

import java.util.Scanner;

public class IndexOfChar {
	
	public int index(String str,char ch) {
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a string and a char to get its index in the string::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		char ch=scanner.next().charAt(0);
		
		System.out.println(new IndexOfChar().index(str,ch));
		
		
	}

}
