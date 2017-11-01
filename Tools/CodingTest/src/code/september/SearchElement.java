package code.september;

public class SearchElement {
	
	
	public int partition(int[]a,int start,int end) {
		
		int lastNum=a[a.length-1];
		int smallIndex=start-1;
		for(int i=start;i<end;i++) {
			if(a[i]<=lastNum) {
				smallIndex=smallIndex+1;
				a[i]=a[i]+a[smallIndex];
				a[smallIndex]=a[i]-a[smallIndex];
				a[i]=a[i]-a[smallIndex];
			}
		}
		a[end]+=a[smallIndex+1];
		a[smallIndex+1]=a[end]-a[smallIndex+1];
		a[end]-=a[smallIndex+1];
		
		return smallIndex+1;		
	}
	
	public void quickSort(int[]a,int start,int end) {
	
		if(start<end) {
			
			int mid=partition(a,start,end);
			quickSort(a,start,mid-1);
			quickSort(a,mid+1,end);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {3,7,4,2,3,5,70,1};
		
		new SearchElement().quickSort(arr, 0, arr.length-1);
	}
	
	

}
