package nov.twenty;

import java.util.Scanner;

public class Ex1120_01 {

	public static void main(String[] args) {
		// �� ������ �Է¹޾�
		// �ִ����� gcd�� �ּҰ����lcm ���
		Scanner sc = new Scanner(System.in);

		int a = 0; // �� �� �� ū �� �������� ��
		int b = 0; // �� �� �� ���� �� ������ ��
		// int c = 0; // ��
		int d = 0; // ������
		int gcd = 0; // �ִ�����
		int lcm = 0; // �ּҰ����

		System.out.print("���� 1 �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է� >> ");
		int num2 = sc.nextInt();

		// 1. �ִ� �����
		// �Է¹��� �� �� �� ū ���� a�� ��ȯ
		if (num1 > num2) {
			a = num1;
			b = num2;
		} else {
			a = num2;
			b = num1;
		}
		// a = b * a/b + a%b ��, ������ = a - b*a/b
		// b = ������1 * ��2 + ������2 (a�ڸ��� b, �������� ������)
		// ������1 = ������2 * ��3 + ������3 ... �ݺ�
		// �������� 0 �� �Ǹ� �����ϰ� �׶��� ���� �ִ�����

		while (true) {
			// c = a / b ; // a = b*c + d
			d = a % b; // d�� 0 �̸� �����ϰ� b ���
			if (d == 0) {
				System.out.println("�ִ� ����� : " + b);
				gcd = b;
				break;
			}
			a = b;
			b = d;
		}

		// 2. �ּҰ���� = �μ��ǰ� / �ִ�����
		a = num1;
		b = num2;
		lcm = (a * b) / gcd; // �ִ������� �ּҰ������ ����
		System.out.println("�ּ� ����� : " + lcm);

		sc.close();

	}

}
