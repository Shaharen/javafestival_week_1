package nov.nineteen;

public class Ex02 {

	public static void main(String[] args) {
		// (77*1) + ... + (1*77) 계산 결과 출력
		int a = 77;
		int b = 1;
		int multiple = 0;
		int sum = 0;
		
		while(true) {
			multiple = a*b;
			sum = sum + multiple;
			a -= 1;
			b += 1;
			if(a == 0) {
				System.out.println(sum);
				break;
			}
		}

	}

}
