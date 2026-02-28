import java.util.*;

public class OddEvenPositionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> oddPos = new ArrayList<>();
        List<Integer> evenPos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                oddPos.add(arr[i]);
            } else {
                evenPos.add(arr[i]);
            }
        }
        oddPos.sort(Collections.reverseOrder());
        Collections.sort(evenPos);
        int oddIndex = 0, evenIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = oddPos.get(oddIndex++);
            } else {
                arr[i] = evenPos.get(evenIndex++);
            }
        }
        System.out.println("Sorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        scanner.close();
    }
}
