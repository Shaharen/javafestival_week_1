package nov.eighteen;

import java.util.Scanner;

public class Ex1118_03 {

	public static void main(String[] args) {
		// 윤년이란 2월에 29일이 있는날
		// 4의 배수이면서 100의 배수가 아닐때는 윤년
		// 400의 배수일때 윤년
		Scanner sc = new Scanner(System.in);

		int year = 0;
		System.out.print("년도 입력 >> ");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("윤년");
		} else if (year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}

		sc.close();

	}

}