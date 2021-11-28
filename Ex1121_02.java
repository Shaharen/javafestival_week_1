package nov.twentyone;

import java.util.Scanner;

public class Ex1121_02 {

	public static void main(String[] args) {
		// A,B 숫자를 입력받아 A-B 출력
		// A와 B 둘다 0을 입력 받으면 프로그램 종료
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();

			System.out.println("결과 >> " + (num1 - num2));

			if (num1 == 0 && num2 == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}
