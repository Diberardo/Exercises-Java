import java.util.Scanner;

public class Exercicio5 {

    public static void ordenar(int[] v1) {
        quickSort(v1, 0, v1.length - 1);
    }

    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = partition(array, inicio, fim);
            quickSort(array, inicio, pivoIndex - 1);
            quickSort(array, pivoIndex + 1, fim);
        }
    }

    public static int partition(int[] array, int inicio, int fim) {
        int pivot = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, fim);
        return i + 1;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[10];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Digite os valores:");
            v1[i] = scanner.nextInt();
        }

        ordenar(v1);

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }

        scanner.close();
    }
}
