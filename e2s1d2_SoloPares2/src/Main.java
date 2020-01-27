import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cantidad = 0;
		int indice = 1;

		System.out.println("Ingrese la cantidad de pares: ");
		cantidad = s.nextInt();
		while (indice <= cantidad) {
			System.out.println(2 * indice);
			indice++;
		}
		s.close();
	}

}
