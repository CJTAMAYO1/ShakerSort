import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ShakerSort {

    public static void shakerSort(int[] array) {
        boolean cambios;
        do {
            cambios = false;
            // Pasada de izquierda a derecha
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Intercambio de elementos
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    cambios = true;
                }
            }

            if (!cambios) {
                // Si no hubo intercambios en la pasada, el arreglo está ordenado
                break;
            }

            cambios = false;
            // Pasada de derecha a izquierda
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    // Intercambio de elementos
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    cambios = true;
                }
            }
        } while (cambios);
    }

    public static void main(String[] args) {
        // Entrada
        String ArchivoEntrada = "D:/archivos/Desarreglo1.txt";
        int[] numeros = readNumbersFromFile(ArchivoEntrada);

        if (numeros != null) {
            System.out.println("Arreglo original: " + Arrays.toString(numeros));

            // Se Aplica el algoritmo
            shakerSort(numeros);

            System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

            // salida
            String ArchivoSalida = "D:/archivos/numeros_ordenados.txt";

            writeNumbersToFile(numeros, ArchivoSalida);
        }
    }

    private static int[] readNumbersFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            String[] StringNumeros = line.split(" ");
            return Arrays.stream(StringNumeros)
                         .mapToInt(Integer::parseInt)
                         .toArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void writeNumbersToFile(int[] numbers, String outputPath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {
            bw.write(Arrays.toString(numbers));
            System.out.println("Arreglo ordenado guardado en: " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
