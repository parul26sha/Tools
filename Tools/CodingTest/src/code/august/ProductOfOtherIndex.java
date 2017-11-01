package code.august;

public class ProductOfOtherIndex {
/*1)Given an array of numbers - every index in output should have the product of other index numbers.
eg: i/p: {5,7,10,2}
o/p: {140,100,70,3500}*/
	
	public void array(int[] arr) {
		int product=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]!=arr[j]) {
					product*=arr[j];
				}
			}
			System.out.println("Product for index::"+i+" is ::" +product);
			product=1;
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr= {5,7,10,2};
		new ProductOfOtherIndex().array(arr);
	}

}
