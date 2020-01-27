import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cantidad = 0;
		int indice = 0;
		int total = 0;

		System.out.println("Ingrese la cantidad: ");
		cantidad = s.nextInt();
		s.close();
		while (indice < cantidad) {
			total = 2 * indice - 1;
			indice++;
		}
		System.out.println(total);

	}

}
