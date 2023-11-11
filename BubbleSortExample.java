import java.util.Random;

public class BubbleSortExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[] randomNumbers = new int[70000];
        Random rand = new Random();

        for (int i = 0; i < 70000; i++) {
            randomNumbers[i] = rand.nextInt(70000) + 1; // Gera números entre 1 e 1.000.000
        }
        int[] sortedArray = bubbleSort(randomNumbers);
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
