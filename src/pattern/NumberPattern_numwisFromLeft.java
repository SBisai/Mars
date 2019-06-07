package pattern;

import java.util.Scanner;

public class NumberPattern_numwisFromLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value: ");
		int n = sc.nextInt();
		int l=0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

}
