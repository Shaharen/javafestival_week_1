package nov.nineteen;

public class Ex1119_01 {

	public static void main(String[] args) {
		// 1 -2 3 -4 ... +99 - 100 를 계산하여 답 출력
		// 1)
		int i = 1;
		int sum = 0;

		while (i < 101) {
			if (i % 2 == 1) {
				sum = sum + i;
				System.out.print(i + " ");
				i++;
			} else {
				sum = sum - i; 
				System.out.print(-i + " "); 
				i++;
			}
		}
		// System.out.println("");
		System.out.println("\n결과 : " + sum);
		System.out.println();
		// 2)
		int sum2 = 0;
		
		for(int j = 1; j <= 100 ; j++) {
			if(j % 2 == 0) {
				System.out.print(-j + " ");
				sum2 = sum2 - j;
			}else {
				System.out.print(j + " ");
				sum2 = sum2 + j;
			}
		}
		System.out.println("\n결과 : " + sum2);

	}
}