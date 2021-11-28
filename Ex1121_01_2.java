package nov.twentyone;

import java.util.Scanner;

public class Ex1121_01_2 {

	public static void main(String[] args) {
		// 소인수 분해 2
		Scanner sc = new Scanner(System.in);

		System.out.print("소인수 분해 할 숫자 >> ");
		int num = sc.nextInt();

		System.out.print(num + " = ");

		for (int i = 2; i <= num; i++) {
			for (; num % i == 0 && num != i;) {
				System.out.print(i + "*");
				num = num / i;
			}
			if (num == i) {
				System.out.print(i);
			}

		}
		sc.close();
	}

}
