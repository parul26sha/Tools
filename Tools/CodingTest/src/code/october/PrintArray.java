package code.october;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintArray {
	
	//Given a sorted integer array, print all elements that appear only once in array. The given array may 
	//contain duplicates and the output should print every element only once.
	
	public void printArray(int[] a) {
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i],1);
			}
			else
				map.put(a[i],map.get(a[i])+1);
		}
		System.out.println(map);
		for(Integer i:map.keySet()) {
			if(!((map.get(i))>1)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,3,4,5,6,6};
		new PrintArray().printArray(a);
	}
}
