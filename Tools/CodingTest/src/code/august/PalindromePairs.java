package code.august;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromePairs {
	
	public boolean checkPalindrom(String str) {	
		for(int i=0,j=str.length()-1;i<str.length()&&j>=0;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		return true;
		
	}
	
	public void printPalindrome()
	{
		//aaba
		System.out.println("Enter a string::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		Set<Character>listOfPalindromes=new HashSet<Character>(); 
		StringBuffer temp=new StringBuffer();
		for(int i=0;i<str.length()-1;i++) {
			listOfPalindromes.add(str.charAt(i));
			temp.append(str.charAt(i));
			for(int j=0;j<str.length();j++) {
				temp.append(str.charAt(j));
				//if(temp)
			}
			
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
