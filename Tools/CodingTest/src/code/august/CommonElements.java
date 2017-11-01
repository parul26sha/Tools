package code.august;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
	
	/*
	 *  try to get the common elements from two different array
	 *  eg array1=10,12,13,14,15 array2=10,89,96,45,1
	 *  o/p-10
	 */
	
	public void common(int[] a,int[] b) {
		Set<Integer> set=new HashSet<Integer>();
		Set<Integer>commonElements=new HashSet<Integer>();
		ArrayList<Integer> completeArray=new ArrayList<Integer>();

		for(int i=0;i<a.length;i++){
		    set.add(a[i]);
		}

		for(int i=0;i<b.length;i++){
		    if(set.contains(b[i])){
		    	commonElements.add(b[i]);
		    } 
		}

		completeArray.addAll(set);
		completeArray.removeAll(commonElements);


		for(int i=0;i<b.length;i++){
		    if(!set.contains(b[i])) {
		    	completeArray.add(b[i]);
		    }
		}
		
		System.out.println("Common Elements::"+commonElements);
		System.out.println("Uncommon Elements::"+completeArray);
	
		
	}
	
	public static void main(String[] args) {
		
		int[] a={10,12, 15 ,16, 18,12};
		int[] b={16 ,12 ,14 ,11 ,10 ,01 ,02,10};
		new CommonElements().common(a,b);
		
	}

}
