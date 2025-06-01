package lista10_JAVA;

public class E07_FatorialImpares {

	public static void main(String[] args) {
		int numero = 1;

		do {
			if (numero % 2 != 0) {
				long fatorial = 1;
				for (int i = 1; i <= numero; i++) {
					fatorial *= i;
				}
				System.out.println("Fatorial de " + numero + " = " + fatorial);
			}
			numero++;
		} while (numero <= 10);
	}
}
