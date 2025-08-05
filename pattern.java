package learn;

public class pattern {
	public static void main(String[] args) {
		
		//pattern-1
		System.out.println("Pattern-1");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Pattern-2
		System.out.println("Pattern-2");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//Pattern-3
		System.out.println("Pattern-3");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (i==1 || i==5 || j==1 || j==5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		//Pattern-4
		System.out.println("Pattern-4");
		int count = 1;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (count<=9) {
					System.out.print("0"+count+" ");
				}
				else {
					System.out.print(count+" ");
				}
				count++;						
			}					
			System.out.println();
		}
	}

}
