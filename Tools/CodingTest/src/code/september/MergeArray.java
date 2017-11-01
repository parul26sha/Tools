package code.september;

import java.util.Arrays;

public class MergeArray {

/*
 * 2.Two sorted integer arrays A and B, merge B into A as one sorted array.
	3.Given two sorted integer arrays A and B, merge B into A as one sorted array.*/
	public void merge(int[] a ,int[] b) {//1,3,5 //
		//-1,2,3,4	
		int alast=a.length-1;
		int blast=b.length-1;
		int index=(a.length+b.length)-1;
		a = Arrays.copyOf(a, a.length+b.length);
		while(alast >=0 && blast>=0) {
			if(a[alast]>b[blast]) {
				a[index]=a[alast];
				index--;
				alast--;
			}
			else {
				a[index]=b[blast];
				blast--;index--;
			}
		}
		while(alast>=0) {
			a[index]=a[alast];
			index--;
			alast--;
		}
		while(blast>=0) {
			a[index]=b[blast];
			index--;
			blast--;
		}
		for (int i : a)
	        System.out.println(i);
	}
	
	public static void main(String[] args) {
		new MergeArray().merge(new int[]{-2,3,5},new int[]{-4,6,7});
	
	}
}
