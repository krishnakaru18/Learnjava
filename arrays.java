package learn;  //package name changes based on your package name
import java.util.Scanner;

public class arrays {
	public static void main(String args[]) {
		Scanner user = new Scanner(System.in);
		
		//1-D array
		System.out.println("----------1-D array-----------");
		int [] a = new int[5];
		for (int i=0; i<5; i++) {
			System.out.print("Enter ages :");
			a[i] = user.nextInt();
			
		}
		System.out.println("The ages are:");
		for (int i=0; i<5; i++) {
			System.out.print(a[i]+" ");
		}
		
		//2-D array
		System.out.println("----------2-D array-----------");
		int[][] b = new int[2][5];
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[0].length; j++) {
				System.out.print("enter array values:");
				b[i][j] = user.nextInt();
			}
		}
		System.out.println("The array vlues are:");
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[1].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
