import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("INGRESE DIMENSIÓN: ");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		patron1(n);
		patron2(n);
		patron3(n);
		patron4(n);
		s.close();
		
	}
	
	public static void patron1(int n) {
		int ancho = 1;
		int altura = 1;
		int dimension = n;

		System.out.println("PATRON 1");
		System.out.println("");

		while (ancho <= dimension) {
			while (altura <= dimension) {
				if (ancho == 1 || ancho == dimension || altura == 1 || altura == dimension)
					System.out.print(" * ");
				else
					System.out.print("   ");
				altura++;

			}
			altura = 1;
			System.out.println();
			ancho++;
		}
	}
	
	public static void patron2(int n) {
		int ancho = 1;
		int altura = 1;
		int dimension = n;
		
		System.out.println("PATRON 2");
		System.out.println("");

		while (ancho <= dimension) {
			while (altura <= dimension) {
				if (ancho == (dimension - altura + 1) || ancho == 1 || ancho == dimension)
					System.out.print(" * ");
				else
					System.out.print("   ");
				altura++;

			}
			altura = 1;
			System.out.println();
			ancho++;
		}
	}
	
	public static void patron3(int n) {
		int ancho = 1;
		int altura = 1;
		int dimension = n;

		System.out.println("PATRON 3");
		System.out.println("");

		while (ancho <= dimension) {
			while (altura <= dimension) {
				if (ancho == altura || ancho == dimension - altura + 1)
					System.out.print(" X ");
				else
					System.out.print("   ");
				altura++;

			}
			altura = 1;
			System.out.println();
			ancho++;
		}
	}
	
	public static  void patron4(int n) {
		int ancho = 1;
		int altura = 1;
		int dimension = n;
		
		System.out.println("PATRON 4");
		System.out.println("");

		while (ancho <= dimension) {
			while (altura <= dimension) {
				if ((altura == 1 && ancho > altura) || (altura == dimension && ancho < dimension)) {
					System.out.print("   ");
				} else {
					System.out.print(" X ");
				}
				altura++;

			}
			altura = 1;
			System.out.println();
			ancho++;
		}
	}
	
}