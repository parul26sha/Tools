package code.october;

public class JavaPattern {
	/*
	 *  1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
	 */

	public void print() {
		
		int num=13;
		int row=1;
		int mid=(num/2)+1;
		while(row<num) {
			for(int i=1;i<=row && row<=num/2+1 ;i++) {
				System.out.print(i);
			}
			
			for(int i=1;i<	mid && row>(num/2)+1 ;i++) {
				System.out.print(i);
			}
			
			System.out.println();
			row++;
			if(row>mid) {
				
				mid--;
			}
		
		}
	}
		/*
		 * 
		 * 
		 * 	1
			2 3
			4 5 6
			7 8 9 10
		 */
		public void print2() {
			
			int num=10;
			int row=1;
			int start=1;
			while(row<=4) {
				for(int i=1,j=start;i<=row && j<=num;i++) {
					System.out.print(start);
					System.out.print(" ");
					start++;
				}
				System.out.println();
				row++;
				
				
			}
		}
		
	
		
/*
 * 
 * 	A B C D E F E D C B A
	A B C D E E D C B A
	A B C D D C B A
	A B C C B A
	A B B A
	A A
 */
	public void print3() {
		
		char start=65;
		char end=70;
		int row=(70-65)+1;
		
		while(row!=0) {
			for(int i=start;i<end;i++) {
				System.out.print((char)i);
				
			}
			for(int i=end-1;i>start;i--) {
				System.out.print((char)i);
				
			
			}
			System.out.println();
			start--;
			end--;
			row--;
		}

	}
		public static void main(String[] args) {
			
			new JavaPattern().print3();
		}

}

