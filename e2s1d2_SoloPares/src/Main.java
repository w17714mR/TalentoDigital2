import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cantidad = 0;
		int indice = 0;

		System.out.println("Ingrese la cantidad de pares: ");
		cantidad = s.nextInt();
		s.close();
		while (indice < cantidad) {
			System.out.println(2 * indice);
			indice++;
		}

	}

}
