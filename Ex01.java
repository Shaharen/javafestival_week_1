package nov.nineteen;

public class Ex01 {
	
	public static void main(String[] args) {
		// 1 -2 3 -4 ... +99 - 100 를 계산하여 답 출력
				
		int i = 1;
		int sum = 0;
		
		while(i < 101) {
			if(i % 2 == 1) {
				sum = sum + i;
				System.out.print(i);
				i++;						
			}else {
				sum = sum - i;
				System.out.print(-i);
				i++;
			}
		}
		// System.out.println("");
		System.out.println("\n결과 : " + sum);
				

	}
}
