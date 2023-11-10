import java.util.Random;

public class BubbleSortExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[] randomNumbers = new int[250000];
        Random rand = new Random();

        for (int i = 0; i < 250000; i++) {
            randomNumbers[i] = rand.nextInt(250000) + 1; // Gera números entre 1 e 1.000.000
        }

       // System.out.print("Números em ordem aleatória: ");
        //for (int num : randomNumbers) {
        //    System.out.print(num + ", ");
        //}77.336 segundos
        //System.out.println();

        int[] sortedArray = bubbleSort(randomNumbers);

        /*System.out.print("Array ordenado: ");
        for (int num : sortedArray) {
            System.out.print(num + ", ");
        }
        System.out.println();*/

        long endTime = System.currentTimeMillis();
        double executionTime = (endTime - startTime) / 1000.0;

        System.out.println("Tempo de execução: " + executionTime + " segundos");
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Troca os elementos arr[i - 1] e arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        return arr;
    }
}
