package nov.twenty;

import java.util.Scanner;

public class Ex1120_02 {

	public static void main(String[] args) {
		// 1���� ū ���� N �� �Է��Ͽ� N! ���� ���Ͽ���
		Scanner sc = new Scanner(System.in);

		int i = 1;
		System.out.print("�Է� : ");
		int n = sc.nextInt();
		int factorial = 1;
		
		// 1) while
		while (true) {
			factorial = factorial * i;
			i++;
			if (i > n) {
				System.out.println("��� : " + factorial);
				break;
			}
		}
		// 2) for
		int factorial2 = 1;
		for (int j = 1 ; j <= n ; j++) {
			factorial2 = factorial2*j;
		}
		System.out.println("��� : " + factorial2);
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
