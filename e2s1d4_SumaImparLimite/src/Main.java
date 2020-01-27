import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int limiteInferior = 0;
		int limiteSuperior = 0;
		int total = 0;

		System.out.println("INGRESE LIMITE INFERIOR: ");
		limiteInferior = s.nextInt();
		System.out.println("INGRESE LIMITE SUPERIOR: ");
		limiteSuperior = s.nextInt();

		while (limiteInferior < limiteSuperior) {
			if (limiteInferior % 2 == 0) {

				limiteInferior++;
				continue;
			} else {
				total = total + limiteInferior;
				limiteInferior++;
			}

		}
		System.out.println(total);
		s.close();
	}

}
