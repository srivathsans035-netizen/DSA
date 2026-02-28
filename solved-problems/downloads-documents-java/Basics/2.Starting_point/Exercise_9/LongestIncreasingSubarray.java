import java.util.*;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxLength = 1;
        int maxStart = 0;
        int currLength = 1;
        int currStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currLength++;
            } else {
                currLength = 1;
                currStart = i;
            }
            if (currLength > maxLength) {
                maxLength = currLength;
                maxStart = currStart;
            }
        }
        System.out.print("Longest increasing sub-array: { ");
        for (int i = maxStart; i < maxStart + maxLength; i++) {
            System.out.print(arr[i]);
            if (i < maxStart + maxLength - 1) System.out.print(", ");
        }
        System.out.println(" }");
        scanner.close();
    }
}
