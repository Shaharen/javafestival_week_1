package nov.twenty;

import java.util.Scanner;

public class Ex1120_01 {

	public static void main(String[] args) {
		// 두 정수를 입력받아
		// 최대공약수 gcd와 최소공배수lcm 출력
		Scanner sc = new Scanner(System.in);

		int a = 0; // 두 수 중 큰 수 나눠지는 수
		int b = 0; // 두 수 중 작은 수 나누는 수
		// int c = 0; // 몫
		int d = 0; // 나머지
		int gcd = 0; // 최대공약수
		int lcm = 0; // 최소공배수

		System.out.print("숫자 1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력 >> ");
		int num2 = sc.nextInt();

		// 1. 최대 공약수
		// 입력받은 두 수 중 큰 수를 a로 변환
		if (num1 > num2) {
			a = num1;
			b = num2;
		} else {
			a = num2;
			b = num1;
		}
		// a = b * a/b + a%b 즉, 나머지 = a - b*a/b
		// b = 나머지1 * 몫2 + 나머지2 (a자리에 b, 나머지를 몫으로)
		// 나머지1 = 나머지2 * 몫3 + 나머지3 ... 반복
		// 나머지가 0 이 되면 종료하고 그때의 몫이 최대공약수

		while (true) {
			// c = a / b ; // a = b*c + d
			d = a % b; // d가 0 이면 종료하고 b 출력
			if (d == 0) {
				System.out.println("최대 공약수 : " + b);
				gcd = b;
				break;
			}
			a = b;
			b = d;
		}

		// 2. 최소공배수 = 두수의곱 / 최대공약수
		a = num1;
		b = num2;
		lcm = (a * b) / gcd; // 최대공약수와 최소공배수의 성질
		System.out.println("최소 공배수 : " + lcm);

		sc.close();

	}

}
