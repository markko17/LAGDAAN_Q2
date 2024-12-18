import java.util.Scanner;

public class SortingAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] SortingAnalysis = new int[10];

        System.out.println("Quiz 2");
        System.out.println("");
        System.out.println("Enter 10 power levels of creatures: "); //Input 10 values for Sorting
        for (int i = 0; i < 10; i++) { // Loop for configuring values 
            SortingAnalysis[i] = scanner.nextInt();
        }

        int[] bubbleSorted = bubbleSort(SortingAnalysis.clone());
        int[] selectionSorted = selectionSort(SortingAnalysis.clone());

        System.out.println("");
        System.out.println("Bubble Sort (Ascending):");
        printArray(bubbleSorted); // Bubble Sort Method for the Output of Ascending
        System.out.println("");

        System.out.println("Selection Sort (Descending):");
        printArray(selectionSorted); // Selection Sort Method for the Output of Descending
        System.out.println("");

        analyzePowerLevels(SortingAnalysis);
    }

    public static int[] bubbleSort(int[] arr) { // Main method for assigning Bubble Sort method
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) { // Main method for assigning Selection Sort method 
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void analyzePowerLevels(int[] arr) { // Declaring variables for minimum and maximum value 
        int sumEven = 0;
        int sumOdd = 0;
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) { // For calculating the value and sum of odd and even numbers 
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Analysis:"); // Output for the sum and odd values
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Minimum Power Level: " + min); // Output for the minimum and maximum value 
        System.out.println("Maximum Power Level: " + max);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); 
        }
        System.out.println();
    }
}
