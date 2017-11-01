package code.september;

import java.util.HashSet;
import java.util.Set;

public class DisplayDuplicates {
	
	public void printDuplicates() {
		int[] arr1= {3,4,5,6,2,1,3,0};
		int[] arr2= {1,7,8,6,2,3,3};

		Set<Integer>set=new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]){
					set.add(arr2[j]);
				}
			}
		}
		System.out.println(set);
		
		
		
	}
	public static void main(String[] args) {
		new DisplayDuplicates().printDuplicates();

	}

}
