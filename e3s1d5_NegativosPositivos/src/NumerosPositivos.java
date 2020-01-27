package tareas;

public class NumerosPositivos {

    public static int[] filtrador(String[] args) {
        int[] arreglo = new int[3];
        for (String e : args) {
            if (Integer.parseInt(e) > 0)
                arreglo[0] += 1;
            else if (Integer.parseInt(e) < 0)
                arreglo[1] += 1;
            else
                arreglo[2] += 1;
        }
        return arreglo;
    }
}
