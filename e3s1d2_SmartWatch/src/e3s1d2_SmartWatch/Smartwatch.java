package tareas;

import java.util.ArrayList;

public class Smartwatch {

    public static ArrayList<Integer> clearSteps(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>();
        for (String arg : args) {
            if (Integer.parseInt(arg) > 200 && Integer.parseInt(arg) < 100000) {
                arreglo.add(Integer.parseInt(arg));
            }
        }
        return arreglo;
    }

    public static int promedio(ArrayList<Integer> a) {
        int total = 0;
        for (int e : a) {
            total += e;
        }
        total = total / a.size();
        return total;
    }


}