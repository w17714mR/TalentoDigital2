package e1s1d1_Resistencias;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        boolean validator = false;
	        float res1 = 0;
	        float res2 = 0;
	        float res3 = 0;

	        while (!validator) {
	            System.out.print("Ingrese resistencia 1: ");
	            res1 = s.nextInt();
	            System.out.print("Ingrese resistencia 2: ");
	            res2 = s.nextInt();
	            System.out.print("Ingrese resistencia 3: ");
	            res3 = s.nextInt();

	            if (res1 > 0 && res2 > 0 && res3 > 0) {
	                validator = true;
	            } else {
	                System.out.println("Las resistencias no son distintas a cero.");
	            }
	        }
	        s.close();
	        System.out.println("La resistencia total es de: " + (1 / ((1 / res1) + (1 / res2) + (1 / res3))));

	}

}
