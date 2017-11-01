package code.august;

import java.util.Scanner;

public class WordsArray {
	
	public String print(){
	    System.out.println("Enter String::");
		Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    StringBuffer buffer=new StringBuffer();
	    String[] strArray=str.split(" ");//how are you
	    for(int i=0;i<strArray.length;i++){
	        if(i==0){
	            buffer.append(strArray[i]);
	            buffer.append(" ");
	        }
	        else if(i==(strArray.length-1)){
	            buffer.insert(0,Character.toUpperCase(strArray[i].charAt(0)));
	            buffer.insert(1,' ');
	            
	        }
	        else{
	            buffer.append(Character.toUpperCase(strArray[i].charAt(0)));
	            buffer.append(" ");
	        }        
	    }
	    
	    
	   
	    return buffer.toString();

	}
	
	public static void main(String[] args) {
		System.out.println(new WordsArray().print());
	}


}
