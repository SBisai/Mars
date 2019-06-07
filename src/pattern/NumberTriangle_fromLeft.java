package pattern;

import java.util.Scanner;

public class NumberTriangle_fromLeft {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value: ");
		int n = sc.nextInt();
		int k=0;
		for(int i=0 ; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				k++;
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
