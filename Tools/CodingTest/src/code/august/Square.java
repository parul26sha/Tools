package code.august;

import java.util.Scanner;

public class Square {
	static int count=1;
	public int calculateSquare(int num){    
		if(num<0) {
			num*=(-1);
		}
		if(count==num) {
			return num;
		}
		count++;
		return num*calculateSquare(num);
    }
    public static void main(String []args) {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter a Number::");
    	int num=scanner.nextInt();
        int square=new Square().calculateSquare(num);
         System.out.println(square);
         
    }
}
