package nov.nineteen;

public class Ex1119_02 {

	public static void main(String[] args) {
		// (77*1) + ... + (1*77) ��� ��� ���
		// 1) while ���
		int a = 77;
		int b = 1;
		int multiple = 0;
		int sum = 0;

		while (true) {
			multiple = a * b;
			sum = sum + multiple;
			a -= 1;
			b += 1;
			if (a == 0) {
				System.out.println(sum);
				break;
			}
		}
		System.out.println();
		// 2) for ���
		int multiple2 = 0;
		int sum2 = 0;
		int j = 1;
		
		for(int i = 77 ; i >= 1 ; i--) {
			multiple2 = i*j;
			j++;
			sum2 = sum2 + multiple2;
		} System.out.println(sum2);

	}

}