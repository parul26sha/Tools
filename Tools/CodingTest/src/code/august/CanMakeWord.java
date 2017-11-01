package code.august;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CanMakeWord {
		
	public String  ifTrue() {
		ArrayList<List<String>>array=new ArrayList<List<String>>();
		array.add(Arrays.asList(("KEUM")));
		array.add(Arrays.asList(("EDLKN")));
		array.add(Arrays.asList(("LKEWN")));
		System.out.println("Enter a word to check if that word can be formed from a given array::");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		Map <Character,Integer> map=new HashMap <Character,Integer>();
		for(List<String> l:array) {
			for(int i=0;i<l.size();i++) {
				for(int j=0;j<l.get(i).length();j++) {
					//System.out.println(l.get(i).charAt(j));
					if(!map.containsKey(l.get(i).charAt(j))) {
						map.put((l.get(i).charAt(j)),1);
					}
					else {
						map.put((l.get(i).charAt(j)),(map.get((l.get(i).charAt(j)))+1));
					}
				}
			}
		}
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))&&map.get(str.charAt(i))>=1) {
				map.put(str.charAt(i),map.get(str.charAt(i))-1);
			}
			else {
				return "Cannot make the word "+str+" from the given list of characters!";
			}
		}
		return "Can make the word "+str+" from the given list of characters!";
		
	}
	

	public static void main(String[] args) {
		System.out.println(new CanMakeWord().ifTrue());

	}

}
