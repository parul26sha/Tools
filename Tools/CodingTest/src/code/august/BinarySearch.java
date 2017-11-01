package code.august;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public boolean search(int[] arr,int num) {
        
        int start=0;
        int end=arr.length-1;
        
        while(start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==num) {
                return true;
            }
            else if(arr[mid]<num) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
                    
        }
        return false;
    }
    public static void main(String[] args) {
        
        
        System.out.println("Enter a num to find out it exits in the array::");
        Scanner scanner=new Scanner(System.in);
        int [] arr=new int[6];
        
        for(int i=0;i<6;i++){
            int num=scanner.nextInt();
            arr[0]=num;
        }
        int num=scanner.nextInt();
        
        System.out.println("Number "+num+" exists in the Array::"+new BinarySearch().search(arr, num));
        
        
    }
    
    
}
