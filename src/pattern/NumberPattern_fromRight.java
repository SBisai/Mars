package pattern;

import java.util.Scanner;

public class NumberPattern_fromRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value: ");
		int n = sc.nextInt();
		int l=0;
		for(int i= 1; i<=n; i++) {
			for(int j=i; j<n; j++ ) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				l++;
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
