package lista10_JAVA;

public class E01_QuadradosNumeros {

	public static void main(String[] args) {
		int num = 15;
		do {
			System.out.println("Número: " + num + ", Quadrado: " + (num * num));
			num++;
		} while (num <= 200);
	}
}
