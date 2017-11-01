package code.august;

public class SelectionSort {
	
	public void sort(int[] arr) {//{21,9,1,0,3,4,2}
		for(int i=0;i<arr.length-1;i++) {
			int smallest=arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<smallest) {
					
					smallest=arr[j];
					index=j;
				}
			}
			arr[index]=arr[i];
			arr[i]=smallest;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void print() {
		String str="WALMART";//LAWMTRA
	
		StringBuffer buffer =new StringBuffer();
		for(int i=(str.length()/2)-1;i>=0;i--) {
			buffer.append(str.charAt(i));
			
		}
		buffer.append(str.charAt(str.length()/2));
		for(int i=str.length()-1;i>str.length()/2;i--) {
			buffer.append(str.charAt(i));
		}
		System.out.println(buffer.toString());
	}
		
		
	
	public static void main(String[] str) {
		int[] arr= {21,9,1,0,3,4,2};
		new SelectionSort().sort(arr);
		new SelectionSort().print();
	}
	

}
