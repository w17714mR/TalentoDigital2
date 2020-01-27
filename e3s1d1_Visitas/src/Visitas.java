package tareas;

import java.util.ArrayList;

public class Visitas {

    public static float promedio(String[] args){
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        int i,n = args.length;
        for (i=0;i<n;i++) {
            arreglo.add(Integer.parseInt(args[i]));
        }
        return(Promedio(arreglo));
    }

    public static int Promedio(ArrayList<Integer> a) {
        int total = 0;
        for (int e: a) {
            total +=e ;
        }
        total = total / a.size();
        return total;

    }
}
