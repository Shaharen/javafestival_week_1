package nov.twentyone;

import java.util.Scanner;

public class Ex1121_01_2 {

	public static void main(String[] args) {
		// ���μ� ���� 2
		Scanner sc = new Scanner(System.in);

		System.out.print("���μ� ���� �� ���� >> ");
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
