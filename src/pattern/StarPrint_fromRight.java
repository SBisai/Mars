package pattern;

import java.util.Scanner;

public class StarPrint_fromRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value: ");
		int n = sc.nextInt();
		for(int i= 1; i<=n; i++) {
			for(int j=i; j<n; j++ ) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
