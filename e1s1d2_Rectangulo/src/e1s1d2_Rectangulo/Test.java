package e1s1d2_Rectangulo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int altura = 0;
        int ancho = 0;
        float x = 0;
        boolean validador = false;

        while (!validador) {
            altura = s.nextInt();
            ancho = s.nextInt();
            x = s.nextFloat();

            if (altura > 0 && ancho > 0 && x < altura - 1 && x < ancho - 1 && x > 0) {
                validador = true;
            } else {
                System.out.println("DATOS INCORRECTOS, FAVOR REVISAR.");
            }
        }
        s.close();
        
        
        System.out.print(altura * ancho + " ");
        System.out.println(2 * ancho + 2 * altura);
        System.out.print((ancho - x) * (altura - x) + " ");
        System.out.println(2 * (ancho - x) + 2 * (altura - x));

    }
}
