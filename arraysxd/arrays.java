package arraysxd;

public class arrays {
    public static void main(String[] args) {
        // Declarar y construir un arreglo
        int[] array1 = new int[5];

        // Llenar arreglo
        for (int i = 0; i < 5; i++) {
            array1[i] = i * 1;
        }

        // Imprimir contenido de arreglo
        for (int dato : array1) {
            System.out.println("contenido del arreglo:" + dato);
        }
    }
}
