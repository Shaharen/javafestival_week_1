package nov.twentyone;

import java.util.Scanner;

public class Ex1121_02 {

	public static void main(String[] args) {
		// A,B ���ڸ� �Է¹޾� A-B ���
		// A�� B �Ѵ� 0�� �Է� ������ ���α׷� ����
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("A �Է� >> ");
			int num1 = sc.nextInt();
			System.out.print("B �Է� >> ");
			int num2 = sc.nextInt();

			System.out.println("��� >> " + (num1 - num2));

			if (num1 == 0 && num2 == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		sc.close();
	}
}
