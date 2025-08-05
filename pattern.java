package learn;

public class pattern {
	public static void main(String[] args) {
		
		//pattern-1
		System.out.println("Pattern-1");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("* ");
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
		//Pattern-5
		System.out.println("Pattern-5");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (i*j<10) {
					System.out.print("0"+i*j+" ");
				}
				else {
					System.out.print(i*j+" ");
				}
			}
			System.out.println();
		}		
		
		//Pattern-6
		System.out.println("Pattern-6");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
					System.out.print(i+j-1+" ");
			}
			System.out.println();
		}
		
		//Pattern-7
		System.out.println("Pattern-7");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
		
		//Pattern-8
		System.out.println("Pattern-8");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
					System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//Pattern-9
		System.out.println("Pattern-9");
		for (int i=1; i<=5; i++) {
			//Printing Spaces
			for (int j=i; j<=5; j++) {
				System.out.print(" ");
			}
			//Printing Stars
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Pattern-10
		System.out.println("Pattern-10");
		for (int i=1; i<=5; i++) {
			//Printing Spaces
			for (int j=i; j<=5; j++) {
				System.out.print(" ");
			}
			//Printing Stars
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
