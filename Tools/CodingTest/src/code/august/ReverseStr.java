package code.august;

public class ReverseStr {

	/*4)Reverse a string with preserving position of spaces
Ex; "I Am Not String"
o/p:- "g ni rtS toNmAI"
9, 29, 3
*/
	
	
	public void reverse(String str) {
		StringBuffer buffer=new StringBuffer();
		String str2[]=str.split(" ");
		for(int i=str2.length-1,k=0;i>=0;i--) {
			for(int j=str2[i].length()-1;j>=0;j--) {
					buffer.append(str2[i].charAt(j));
			}
		}
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				buffer.insert(i," ");
			}
		}
		System.out.println(buffer.toString());
		
	}
	
	
	public static void main(String[] args) {
		
		String str="I Am Not String";
		new ReverseStr().reverse(str);
		System.out.println(str);
	}
}
