package tareas;

import java.util.ArrayList;

public class MultiplosDeTres {

    public static int sumaValores(ArrayList<Integer> arreglodeenteros) {
        int total = 0;
        for (int entero : arreglodeenteros) {
            total += entero;
        }
        return total;
    }

    public static ArrayList<Integer> filtro(String[] args) {
        ArrayList<Integer> arregloFiltrado = new ArrayList<>();
        for (String e : args) {
            if (Integer.parseInt(e) % 3 == 0) {
                arregloFiltrado.add(Integer.parseInt(e));
            }
        }
        return arregloFiltrado;
    }

    public static float promedio(ArrayList<Integer> arreglo) {
        float total = 0;
        for (int e : arreglo) {
            total += e;
        }
        return total / arreglo.size();
    }
}
