package nov.eighteen;

import java.util.Scanner;

public class Ex1118_02 {

	public static void main(String[] args) {
		// 거스름돈을 입력 받아 내어줘야하는 지폐의 개수 출력
		// 최대 단위는 1만원, 최소 단위는 100원
		Scanner sc = new Scanner(System.in);

		int cash = 0;
		System.out.print("현재금액 : ");
		cash = sc.nextInt();

		String tenThousand = (cash / 10000) + "개";
		String fiveThousand = ((cash % 10000) / 5000) + "개";
		String thousand = ((cash % 5000) / 1000) + "개";
		String fiveHundred = ((cash % 1000) / 500) + "개";
		String hundred = ((cash % 500) / 100) + "개";

		System.out.println("잔돈변환");
		System.out.println("10000원 : " + tenThousand);
		System.out.println("5000원 : " + fiveThousand);
		System.out.println("1000원 : " + thousand);
		System.out.println("500원 : " + fiveHundred);
		System.out.println("100원 : " + hundred);

		sc.close();

	}
}
