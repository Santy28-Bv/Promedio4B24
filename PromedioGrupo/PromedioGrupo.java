package PromedioGrupo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo {
    public static void main(String[] args) throws IOException {
        System.out.println("Tamaño Grupal es N \n Las calificaciones se leen y se almacenan en un arreglo de tamaño N");
        int N; // Tamaño del Arreglo
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double[] calificaciones; // Arreglo de Calificaciones
        double suma = 0;
        double promedio;
        System.out.println("Programa que calcula el promedio de un Grupo");
        System.out.println("Escribe el tamaño del Grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);
        // Construimos el areeglo de Calificaciones
        calificaciones = new double[N];
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println("Escriba la calificacion del Alumno " + (i + 1) + ": ");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        promedio = suma / N;
        System.out.println("Las Calificaciones del Grupo son: ");
        for (int i = 0; i < calificaciones.length; i++){
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del Grupo es: " + promedio);
    }
}