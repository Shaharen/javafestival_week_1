package nov.twentyone;

import java.util.Scanner;

public class Ex1121_01_1 {

	public static void main(String[] args) {
		// ���μ� ���ظ� ���ִ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int num = sc.nextInt();
		int i = 2;
		// i�� num���� ������ �Ǻ� -> ��(�Ʒ� ����), ����(����)
		// �Է¹������� 2���� 1�� Ű�����鼭 ������
		// ��1) 2�� ��������� num%2 �� 3���� ������, ���ڿ� 2*�� ���
		// ��2) 2�� �ȳ�������� num �� 3���� ������
		// ��� �ݺ��ϴٰ� �������� 0�̵Ǹ� �����, �Ǵ� ���� 1
		System.out.print(num + " = ");
		while (i <= num) {
			while (num % i == 0) {
				System.out.print(i);
				num = num / i;
				if (num == 1) {
					break;
				}
				System.out.print("*");
			}
			i++;
		}
		sc.close();
	}

}
