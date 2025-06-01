package lista10_JAVA;

public class E03_DivisiveisPor4 {

	public static void main(String[] args) {
		int num = 1;
		do {
			if (num % 4 == 0) {
				System.out.println(num);
			}
			num++;
		} while (num < 200);
	}
}
