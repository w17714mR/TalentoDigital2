package e2s1d2_SoloPares;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		args = new String[] { "3001", "1402", "1304", "1505" };
		System.out.println(Visitas.promedio(args));

	}

	public static class Visitas {

		public static float promedio(String[] args) {
			ArrayList<Integer> arreglo = new ArrayList<Integer>();
			int i, n = args.length;
			for (i = 0; i < n; i++) {
				arreglo.add(Integer.parseInt(args[i]));
			}
			return (Promedio(arreglo));
		}

		public static int Promedio(ArrayList<Integer> a) {
			int total = 0;
			for (int e : a) {
				total += e;
			}
			total = total / a.size();
			return total;

		}
	}

}
