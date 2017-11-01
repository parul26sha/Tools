


package code.august;

import java.util.Scanner;

public class LinearSearch {

    
    public int linearSearch(int[] arr,int num) {
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==num) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {11,2,3,34,5,6,72,8,9,10};
        System.out.println("Enter a num to find out it exits in the array::");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int index= new LinearSearch().linearSearch(arr, num);
        if(index!=-1){
            System.out.println("Number "+num+" exists in the Array at index :: "+ index );
        }
        else{
        System.out.println("Number does not exist in the array!");
        }
        
    }
    
   
}
