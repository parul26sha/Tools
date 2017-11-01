package codeTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class CheckIfValidString {
	
	public boolean ifValid() {
		System.out.println("Enter a String::");//{[])}
		Scanner scanner =new Scanner(System.in);
		String str=scanner.nextLine();
		Map<Character,Character> map=new HashMap<Character,Character>();
		map.put('{','}');
		map.put('[',']');
		map.put('(',')');
		Stack<Character> list=new Stack<Character>();
		
		
		for(int i=0;i<str.length();i++) {
			//if(Character.isLetterOrDigit(str.charAt(i))){
				//continue;
			//}
			if(map.containsKey(str.charAt(i))) {
				list.push(map.get(str.charAt(i)));
			}
			else {
				if(!list.isEmpty()&&list.peek()==str.charAt(i)) {
					list.pop();
				}
				else {
					return false;
				}
			}
		}
		
		if(!list.isEmpty()) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		boolean b=new CheckIfValidString().ifValid();
		System.out.println(b);
	}

}
