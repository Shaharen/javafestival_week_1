package nov.eighteen;

import java.util.Scanner;

public class Ex1118_01 {

	public static void main(String[] args) {
		// 정수를 입력받아
		// 1의 자리에서 반올림 한 결과를 출력
		Scanner sc = new Scanner(System.in);

		int before = 0;
		int after = 0;
		System.out.print("반올림 전 값 : ");
		before = sc.nextInt();

		if (before % 10 < 5) {
			after = (before / 10) * 10;
		} else {
			after = (before / 10) * 10 + 10;
		}

		System.out.println("반올림 후 값 : " + after);
		sc.close();

	}

}
