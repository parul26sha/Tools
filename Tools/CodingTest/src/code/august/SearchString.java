package code.august;

import java.util.Scanner;

public class SearchString {

	
	public boolean search(){
	    System.out.println("Enter main string::");
	    
	    Scanner scanner=new Scanner(System.in);
	    String str=scanner.nextLine();
	    
	    System.out.println("Enter search string::");
	    String searchStr=scanner.nextLine();
	  
	    String[] strArray=str.split(" ");
	    for(int i=0;i<strArray.length;i++){
	        if(strArray[i].equals(searchStr)){
	            return true;
	        }
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		System.out.println(new SearchString().search()); 

	}
}
