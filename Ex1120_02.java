package nov.twenty;

import java.util.Scanner;

public class Ex1120_02 {

	public static void main(String[] args) {
		// 1보다 큰 정수 N 를 입력하여 N! 값을 구하여라
		Scanner sc = new Scanner(System.in);

		int i = 1;
		System.out.print("입력 : ");
		int n = sc.nextInt();
		int factorial = 1;
		
		// 1) while
		while (true) {
			factorial = factorial * i;
			i++;
			if (i > n) {
				System.out.println("출력 : " + factorial);
				break;
			}
		}
		// 2) for
		int factorial2 = 1;
		for (int j = 1 ; j <= n ; j++) {
			factorial2 = factorial2*j;
		}
		System.out.println("출력 : " + factorial2);
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
