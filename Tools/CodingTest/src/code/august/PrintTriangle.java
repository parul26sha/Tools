package code.august;

public class PrintTriangle {
	
	public void triangle() {
		int count=-1;
		int length = 33;
		int startspacesTriangleIndex=length-4;
		
		for(int i=length;i>=1;i-=2) {
			for(int k=length;k>i;k--) {
				System.out.print(" ");
			}
			int mid=(i/2)+1;		
			for(int j=1;j<=i;j++) {
				if(i>=length-(length/2)&& i!=length && j==mid) {
					System.out.print("  ");
				}
				else {
					if(i>=(length-(length/2)) && i<=startspacesTriangleIndex && (j<=mid+count)&&(j>=mid-count)) {
						System.out.print("  ");	
					}
					else {
						System.out.print("* ");
					}
				}
			}
			count++;
			System.out.println();
			System.out.println();
			
		}
		
	}

	
	public static void main(String[] args) {
		new PrintTriangle().triangle();
	}
}
