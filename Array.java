package learn;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		//1-Dimensional array
		int[] arr = new int[10];
		arr[1]=3;
		System.out.println(arr[1]);
		
		//2-Dimensional array
		int[][] arr2 = new int[10][10];  
		arr2[1][0]=3;
		System.out.println(arr2[1][0]);
		
		//3-Dimensional array
		int[][][] arr3 = new int[2][3][5];  //imagine like 2-schools, 3-classes, 5-students
		arr3[0][0][0]=3;
		System.out.println(arr3[0][0][0]);
		
		//looping through 1-dimensional array
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		for (int i=1; i<5; i++) {
			System.out.print("Enter the array elements "+i+" :");
			a[i]=scan.nextInt();
		}
		for (int i=1; i<5; i++) {
			System.out.print(a[i]+" ");
		}
		
		//looping through 2-dimensional array
		System.out.println("Enter number for 2-dem-array");
		int[][] b = new int[2][5];
		for (int i=1; i<5; i++) {
			for (int j=1; j<5; j++) {
				System.out.print("Enter the array elements:");
				b[i][j] = scan.nextInt();
			}
		}
		for (int i=1; i<5; i++) {
			for (int j=1; j<5; j++){
				System.out.print(b[i][j]+" ");
			}
			
		}
	}
}
