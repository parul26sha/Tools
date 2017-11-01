package code.august;

import java.util.Scanner;
public class SortRelease {

	public void print() {
		System.out.println("Enter a String:: ");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		StringBuffer buffer=new StringBuffer();
		for(int i=str.length()-1,j=0;i>str.length()/2&& j<str.length()/2;i--,j++) {
			
			buffer.append(str.charAt(i));
		}
		
		buffer.append(str.charAt(str.length()/2));
		for(int i=0;i<str.length()/2;i++) {
			buffer.append(str.charAt(i));
		}
		System.out.println(buffer.toString());	
	}
	public int comPareTo(char ch,char ch1) {
		if(ch1<ch){
			return -1;
		}
		else if(ch1>ch) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public void  sort() {
		String[] str= {"1.2.1", "1.5.9" , "4.2.3","3.0.1","0.1.1","0.6.2"};//{3,5,4,1}
		for(int i=0;i<str.length-1;i++) {
			String smallest=str[i];
			int index=i;
			for(int j=i+1;j<str.length;j++) {
				
				for(int m=0;m<smallest.replace(".","").length();m++) {
					if(comPareTo(smallest.replace(".","").charAt(m),str[j].replace(".","").charAt(m))==-1){
						//System.out.println(smallest+"@");
						smallest=str[j];
						index=j;
						break;
					}
					else if(comPareTo(smallest.replace(".","").charAt(m),str[j].replace(".","").charAt(m))==1) {
						break;
						
					}
				}
			}
			str[index]=str[i];
			str[i]=smallest;
		}
		System.out.println("Printing sorted array::");
		for(String s: str) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		new SortRelease().print();
		new SortRelease().sort();
		
		
	}

}
