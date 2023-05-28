import java.util.Arrays;

public class MedianaArray {
    public static void main(String[] args) {
        // Definir el array de números
        int[] numeros = {5, 10, 15, 20, 25};

        // Ordenar el array en orden ascendente
        Arrays.sort(numeros);

        // Calcular la mediana
        double mediana;
        if (numeros.length % 2 == 0) {
            int indiceMedio1 = numeros.length / 2 - 1;
            int indiceMedio2 = numeros.length / 2;
            mediana = (numeros[indiceMedio1] + numeros[indiceMedio2]) / 2.0;
        } else {
            int indiceMedio = numeros.length / 2;
            mediana = numeros[indiceMedio];
        }

        // Imprimir la mediana
        System.out.println("La mediana es: " + mediana);
    }
}
