package code.august;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
	
	public boolean anagram(String str1,String str2) {
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<str1.length();i++) {
			if(map.containsKey(str1.charAt(i))){
				map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
			}
			else {
				map.put(str1.charAt(i),1);
			}
		}
		
		for(int i=0;i<str2.length();i++) {
			System.out.println(map);
			if(map.containsKey(str2.charAt(i))&&(map.get(str2.charAt(i))>0)) {
				System.out.println("----");
				map.put(str1.charAt(i),map.get(str1.charAt(i))-1);
			}
			else {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	/*public char findTheDifference() {
		String s = "cbaebabacd";
		String t = "abc";
		
		Map<Character,Integer>map=new HashMap();
		for(int i=0;i<=(s.length()-t.length());i++) {
			int index=i;
			for(int j=i;j<i+t.length();j++) {
				
			}
		}
	}*/
	public static void main(String[] args) {
		System.out.println(new FindTheDifference().anagram("abc", "cba"));
	}
		
		
        
	

}
