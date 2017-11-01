package code.october;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
	//Write a program to convert binary to decimal number.
	public void binaryTodecimal() {
		
		System.out.println("Enter Binary number::");
		Scanner scanner=new Scanner(System.in);
		String binary=scanner.nextLine();
		
		int num=1;
		int sum=0;
		for(int i=binary.length()-1;i>=0;i--) {
				
			if(i==binary.length()-1 && binary.charAt(i)=='1') {
				sum+=1;
				num*=2;
			}
			else if(binary.charAt(i)=='1') {
				sum+=num;
				num*=2;
			}
			else {
				num*=2;
			}
		}
		System.out.println("Decimal numer of "+binary+" :: "+sum);
	}
	
	public static void main(String [] args) {
		new ConvertBinaryToDecimal().binaryTodecimal();
	}

}
