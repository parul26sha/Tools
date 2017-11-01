package code.august;

public class BubbleSort {
	
//bestcase:O(nsquare)
//worstcase:O(nsquare)
	
	
	public void sort(int[]arr) {
		
		int start=0,next=start+1;//{0,1,2,8,9}
		int end =arr.length;
		int first=0;
		
		while(first<arr.length-1) {	
			while(start<end && next<end) {
				if(arr[start]>arr[next]) {
					arr[start]+=arr[next];
					arr[next]=arr[start]-arr[next];
					arr[start]=arr[start]-arr[next];
					start++;
					next++;
				}
				else {
					start++;
					next++;
				}
			}
			first++;
			start=0;next=start+1;end--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	
	public static void main(String[] args) {
		int arr[]= {9,3,6,8,99,32,1,2};
		new BubbleSort().sort(arr);
		
	}
}
