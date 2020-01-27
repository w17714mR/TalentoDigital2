import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("FAVOR INGRESE ENE: ");
		int limite = s.nextInt();
		int indice = 0;
		int numero1 = 0;
		int numero2 = 1;
		int total = 0;

		while (indice <= limite) {
			System.out.println(numero1);
			total = numero1 + numero2;
			numero1 = numero2;
			numero2 = total;
			indice++;
		}
		s.close();
	}

}
