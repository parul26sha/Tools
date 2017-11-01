package code.october;

import java.util.Scanner;

public class DecimalToBinary {
	
	public void convert() {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		String binary="";
		
		while(num>0) {
			binary+=Integer.toString(num%2);
			num=num/2;
		}
		String temp="";
		for(int i=(binary.length())-1;i>=0;i--) {
			temp+=binary.charAt(i);
		}
		
		System.out.println("Binary::"+temp);
		
	}
	
	public static void main(String[] args) {
		new DecimalToBinary().convert();
		
		String a="wdgd";
		a=a.replace('w', 'm');
		
		System.out.println(a);
	}
	

}
