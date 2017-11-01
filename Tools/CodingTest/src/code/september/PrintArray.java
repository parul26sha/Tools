package code.september;

import java.util.ArrayList;

public class PrintArray {
	
	public void print(){
		String[] str= {"This","dudk", "is", "an", "example", "of", "text", "justification.","hello","world"};
		StringBuffer buffer=new StringBuffer();	
		ArrayList<String>array=new ArrayList<String>();
		int num=str.length/3;
		for(int i=0;i<(num*3);i++){
			if(( i+1)%3==0)
			{
				
				buffer.append(str[i]);
				array.add(buffer.toString());
				buffer=new StringBuffer();
			}
			else{
				buffer.append(str[i]);	
				buffer.append(" ");
			}	
		}
		
		
		buffer=new StringBuffer();
		num=num*3;
		while(num <str.length){
				buffer.append(str[num]);	
				buffer.append(" ");
				num++;						
				array.add(buffer.toString());
			}	
		
		for(String s:array) {
			System.out.println(s);
			
		}
	}
	public static void main(String[] args) {
		new PrintArray().print();
	}
		
		

}
//call done?? yes nira What she said? should i call you?ok
