package code.august;

public class ReverseNum {

	
	/*3)Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
Note:The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
Check for boundary conditions*/
	
	public int reverseNum(int num) {
		int newNum=num;
		if(num<0) {
			newNum*=-1;
		}
		else {
			newNum=num;
		}
		
		System.out.println(newNum);
		int finalNum=0;
		if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE) {
			return 0; 
		}
		int count=0;
		while(newNum>0) {
			count++;
			newNum/=10;
		}
		int[] arr=new int[count];
		newNum=num;
		int i=1;
		while(count-1>=1) {
			i*=10;
			count--;
		}
		while(newNum!=0) {
			finalNum+=(newNum%10)*i;
			i/=10;
			newNum=newNum/10;
		}
		
		return finalNum;
		
	}
	
	public static void main(String[] args) {
		int num=new ReverseNum().reverseNum(-98);
		System.out.println("Reverse is::"+num);
	}


}
