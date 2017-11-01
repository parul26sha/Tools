package codeTest;

public class RotateArray {
	
	/*Rotate an array of n elements to the right by k steps.
	For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].*/
    public void rotate(int[] nums, int k) {
       
        int i=(nums.length)-1;
        int j=(nums.length)-2;
        while(k>0){
            int end=nums[i];
            while(j>=0 ){
                nums[i]=nums[j];
                j--;i--;
            }
            nums[0]=end;
            end=nums[nums.length-1];
            k--;
            i=(nums.length)-1;
            j=(nums.length)-2;
        }
    }

    public static void main(String[] args) {
    	int[] nums= {1,2,3,4,5,6,7};
    	new RotateArray().rotate(nums,3);
    	for(Integer i:nums) {
    		System.out.print(i+",");
    	}

    	
    }

}

