package code.october;

public class ReverseString {
	
	// How to reverse the words of the String..
	//I/p- HOw are you?
	//o/p wOH era ?uoy

	public String reverseWord(String str) {
		String newStr="";
		for(int i=str.length()-1;i>=0;i--) {
			newStr+=str.charAt(i);
		}
		
		return newStr;
	}
	
	public void reverseString(String str) {
		
		String[] strArray=str.split(" ");
		for(int i=0;i<strArray.length;i++) {
			strArray[i]= reverseWord(strArray[i]);
		}
		str="";
		for(int i=0;i<strArray.length;i++) {
			str+=strArray[i];
			str+=" ";
		}	
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		new ReverseString().reverseString("HOw are you?");
		
	}
	
}
