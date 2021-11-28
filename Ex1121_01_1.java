package nov.twentyone;

import java.util.Scanner;

public class Ex1121_01_1 {

	public static void main(String[] args) {
		// 소인수 분해를 해주는 프로그램 작성
		Scanner sc = new Scanner(System.in);

		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
		int i = 2;
		// i가 num보다 작은지 판별 -> 참(아래 진행), 거짓(종료)
		// 입력받은수를 2부터 1씩 키워가면서 나눈다
		// 예1) 2로 나눠진경우 num%2 를 3으로 나눈다, 문자열 2*로 출력
		// 예2) 2로 안나눠진경우 num 을 3으로 나눈다
		// 계속 반복하다가 나머지가 0이되면 멈춘다, 또는 몫이 1
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
