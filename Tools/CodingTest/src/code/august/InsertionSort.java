package code.august;

import java.util.HashSet;
import java.util.Set;

public class InsertionSort {
	//bestcase:O(nsquare)
	//worstcase:O(nsquare)
	public void sort(int[] arr) {
		
		
		int sS=0,sE=0;
		int uS=sE+1,uE=arr.length-1;
		
		while(uS<=uE) {
			int element=arr[uS];
			while(sE>=sS) {
				if(element<arr[sE]) {
					arr[sE+1]=arr[sE];
					sE--;
				}
				else if(arr[sE]<=element && arr[sE+1]>=element) {
					arr[sE+1]=element;
					break;
				}
			
			}
			if(arr[sS]>element) {
				arr[sS]=element;
				sE=uS;
				uS=sE+1;
			}
			else {
				sE=uS;
				uS=sE+1;
			}
			
		}	
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {4,42,23};//01234,4,5579
		new InsertionSort().sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
