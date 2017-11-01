package code.october;

import java.util.Scanner;

public class Triangle {

	
		/* 1
		 1 2 1
	   1 2 3 2 1*/
	
	//The trick is make the first loop run from 1 to <the num and the next loop run from the num to 1
	public void print() {
		
		Scanner scanner=new Scanner(System.in);
		int numline= scanner.nextInt();
		for(int i=1;i<=numline;i++) {
			
			for(int s=numline;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(j);	
			}
			for(int m=i;m>=1;m--) {
				System.out.print(m);	
			}
			
			System.out.println();
		}		
			
	}
	
	public static void main(String[] args) {
		new Triangle().print();
	}

	
}
	
