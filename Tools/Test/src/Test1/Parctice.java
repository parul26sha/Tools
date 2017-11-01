package Test1;

import java.util.HashMap;
import java.util.Map;

public class Parctice {

	
	public void removeVowels() {
		/*1) Java program to remove vowels from a string.*/
		String str="aggdeiou";
		String str2=str.replaceAll("[aeiou]", "");
		System.out.println(str2);
		
	
	}
	
	public void transposeMatrix() {
	
		/*Java program to find the Transpose of a given matrix.*/
		int[][] array=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int [][] array2=new int[array.length][array[0].length];
		int row=0;
		int col=0;
		int indexrow=0;
		int indexcol=0;
		int num=0;
		while(num<array[0].length) {
			while(row<array.length) {
				array2[indexrow][indexcol]=(array[row][col]);
				row++;indexcol++;
			}
			indexrow++;
			indexcol=0;
			col++;
			row=0;
			num++;
		}
		
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				System.out.print(array2[i][j]);
			}
			System.out.println();
			
		}
	}
	
	public String anagram() {
		/*2) Java program to see if two strings are anagram of each other.*/
		
		String a="rob   e";
		a=a.replace(" ","");
		String b="bo lk";
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<a.length();i++) {
			if(Character.isLetter(a.charAt(i))&&map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i),map.get(a.charAt(i))+1);
			}
			else {
				map.put(a.charAt(i),1);
			}
		}
		
		for(int i=0;i<b.length();i++) {
			
			if(map.containsKey(b.charAt(i))&&map.get(b.charAt(i))>=1) {
				map.put(b.charAt(i),map.get(b.charAt(i)-1));
			}
			else {
				return (b+" is not an anagram of "+a);
			}		
		}
		
		return (b+" is an anagram of "+a);
	}

		
	public static void main(String[] args) {
		/*Java program to see if two strings are anagram of each other.*/

		System.out.println(new Parctice().anagram());
		//new Parctice().removeVowels();
	
	}
}
