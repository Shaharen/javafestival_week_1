package nov.eighteen;

import java.util.Scanner;

public class Ex1118_04 {

	public static void main(String[] args) {
		// ���ڸ��� * ���ڸ����� �� �������� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� �Է� >> ");
		int a = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int b = sc.nextInt();

		int bHundred = b / 100;
		int bTen = (b % 100) / 10;
		int bOne = b % 10;

		int firstLine = a * bOne;
		int secondLine = a * bTen;
		int thirdLine = a * bHundred;
		int result = a * b;
		// �Ǵ� int result = firstLine + secondLine * 10 + thirdLine * 100;

		System.out.println(firstLine);
		System.out.println(secondLine);
		System.out.println(thirdLine);
		System.out.println(result);

		sc.close();
	}

}