package code.august;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LargestNum {

	/*
	 * 2)Given a list of non negative integers, arrange them such that they form the largest number.
	 * For example, given [3, 30, 34, 5, 9,3,29], the largest formed number is 9534330.*/
	
	
	public String largestNum(int[] arr) {
		String[] strArray=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			strArray[i]=String.valueOf(arr[i]);
		}
		
		Comparator<String> comp=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String str1=o1+o2;
				String str2=o2+o1;
				return str2.compareTo(str1);
			}
			
			
		};
		Arrays.sort(strArray,comp);
		
		StringBuffer buffer=new StringBuffer();
		for(String s:strArray) {
			buffer.append(s);
		}
		if(strArray[0].charAt(0)=='0'){
            return"0";
        }
		return (buffer.toString());
		
		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr= {3, 30, 34, 5, 9,3,29};//
		new LargestNum().largestNum(arr);
	}
}
