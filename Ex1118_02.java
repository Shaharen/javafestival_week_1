package nov.eighteen;

import java.util.Scanner;

public class Ex1118_02 {

	public static void main(String[] args) {
		// �Ž������� �Է� �޾� ��������ϴ� ������ ���� ���
		// �ִ� ������ 1����, �ּ� ������ 100��
		Scanner sc = new Scanner(System.in);

		int cash = 0;
		System.out.print("����ݾ� : ");
		cash = sc.nextInt();

		String tenThousand = (cash / 10000) + "��";
		String fiveThousand = ((cash % 10000) / 5000) + "��";
		String thousand = ((cash % 5000) / 1000) + "��";
		String fiveHundred = ((cash % 1000) / 500) + "��";
		String hundred = ((cash % 500) / 100) + "��";

		System.out.println("�ܵ���ȯ");
		System.out.println("10000�� : " + tenThousand);
		System.out.println("5000�� : " + fiveThousand);
		System.out.println("1000�� : " + thousand);
		System.out.println("500�� : " + fiveHundred);
		System.out.println("100�� : " + hundred);

		sc.close();

	}
}
