package pattern;

import java.util.Scanner;

public class StarTriangle_Fromleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
