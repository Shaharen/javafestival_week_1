package nov.eighteen;

import java.util.Scanner;

public class Ex1118_04 {

	public static void main(String[] args) {
		// 세자리수 * 세자리수의 각 계산과정을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >> ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int b = sc.nextInt();

		int bHundred = b / 100;
		int bTen = (b % 100) / 10;
		int bOne = b % 10;

		int firstLine = a * bOne;
		int secondLine = a * bTen;
		int thirdLine = a * bHundred;
		int result = a * b;
		// 또는 int result = firstLine + secondLine * 10 + thirdLine * 100;

		System.out.println(firstLine);
		System.out.println(secondLine);
		System.out.println(thirdLine);
		System.out.println(result);

		sc.close();
	}

}