package codeTest;

import java.util.Scanner;

public class AddNum {
	public int add(int a,int b) {
		for(int i=0;i<a;i++) {
			b++;
		}
		return b;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers to sum them::");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		int sum=new AddNum().add(a,b);
		System.out.println(sum);
	}

}
