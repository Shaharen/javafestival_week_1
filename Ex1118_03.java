package nov.eighteen;

import java.util.Scanner;

public class Ex1118_03 {

	public static void main(String[] args) {
		// �����̶� 2���� 29���� �ִ³�
		// 4�� ����̸鼭 100�� ����� �ƴҶ��� ����
		// 400�� ����϶� ����
		Scanner sc = new Scanner(System.in);

		int year = 0;
		System.out.print("�⵵ �Է� >> ");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("����");
		} else if (year % 400 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���� �ƴ�");
		}

		sc.close();

	}

}