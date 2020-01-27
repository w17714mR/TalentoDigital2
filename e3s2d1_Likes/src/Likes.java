package tareas;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Likes {

    public void principal(String nombre) {

        try {
            FileReader fr = new FileReader(nombre);
            int data = fr.read();
            ArrayList<String> votos = new ArrayList<>();
            StringBuilder lectura = new StringBuilder();

            while (data != -1) {
                if (data == 32 || (char) data == '\n') {
                    votos.add(lectura.toString());
                    lectura = new StringBuilder();
                    data = fr.read();
                } else {
                    lectura.append((char) data);
                    data = fr.read();
                }
            }

            int[] contador1 = contador(votos);
            ranking(contador1);
            fr.close();

        } catch (Exception e) {
            System.out.println("Error leyendo fichero:  " + e.getMessage());
        }
    }

    public int[] contador(ArrayList<String> votos) {
        int[] arreglo = new int[9];
        for (String v : votos) {
            arreglo[Integer.parseInt(v.substring(4)) - 1]++;
        }
        return arreglo;
    }

    public void ranking(int[] conteo) {
        List<Integer> lista = new ArrayList<>();
        for (int a : conteo) {
            lista.add(a);
        }

        for (int i=0;i<lista.size();i++){
            System.out.println("LA FOTO NÚMERO "+(i+1)+" OBTUVO "+lista.get(i)+" VOTOS.");
        }
        System.out.println("EL PROMEDIO DE VOTOS POR FOTO ES DE: " + lista.stream().reduce(0, Integer::sum) / lista.size()+" VOTOS.");
        int max = lista.stream().reduce(1, Integer::max);
        int fotoMaxima = lista.indexOf(max)+1;
        int min = lista.stream().reduce(1000, Integer::min);
        int fotoMinima = lista.indexOf(min)+1;
        System.out.println("EL MAXIMO ES LA FOTO " + fotoMaxima + " CON " + max + " VOTOS.");
        System.out.println("EL MINIMO ES LA FOTO " + fotoMinima + " CON " + min + " VOTOS.");
    }
}
