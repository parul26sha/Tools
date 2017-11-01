package code.october;

public class JavaPattern2 {
	/*
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
	 */

	public void print() {
		
		int num=7;
		while(num!=0) {
			for(int i=1;i<=num;i++) {
				System.out.print(i);
			}
			System.out.println();
			num--;
			
			
		}	
	}
	/*
	 * 
	 * 	7 6 5 4 3 2 1
		7 6 5 4 3 2
		7 6 5 4 3
		7 6 5 4
		7 6 5
		7 6
		7
	 */
	
	public void print2() {
		
		int num=7;
		int row=1;
		while(row<=7) {
			for(int i=num;i>=row;i--) {
				System.out.print(i);
			}
			System.out.println();
			row++;
			
			
		}	
	}
	
	/*
	 * 
	 * 	7
		7 6
		7 6 5
		7 6 5 4
		7 6 5 4 3
		7 6 5 4 3 2
		7 6 5 4 3 2 1
	 */
	
	public void print3() {
		
		int num=7;
		int row=7;
		while(row!=0) {
			for(int i=num;i>=row;i--) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			row--;
			
		}	
	}
	
	
	
	/*
	 * 
	 * 	7 6 5 4 3 2 1
		6 5 4 3 2 1
		5 4 3 2 1
		4 3 2 1
		3 2 1
		2 1
		1
	 */
	
	public void print4() {
		
		int num=7;
		int row=1;
		while(row<=7) {
			for(int i=num;i>=1;i--) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			num--;
			row++;
			
		}
		
		
	}
		public static void main(String[] args) {
			
			new JavaPattern2().print4();
		}

}
