package nov.eighteen;

import java.util.Scanner;

public class Ex1118_01 {

	public static void main(String[] args) {
		// ������ �Է¹޾�
		// 1�� �ڸ����� �ݿø� �� ����� ���
		Scanner sc = new Scanner(System.in);

		int before = 0;
		int after = 0;
		System.out.print("�ݿø� �� �� : ");
		before = sc.nextInt();

		if (before % 10 < 5) {
			after = (before / 10) * 10;
		} else {
			after = (before / 10) * 10 + 10;
		}

		System.out.println("�ݿø� �� �� : " + after);
		sc.close();

	}

}
