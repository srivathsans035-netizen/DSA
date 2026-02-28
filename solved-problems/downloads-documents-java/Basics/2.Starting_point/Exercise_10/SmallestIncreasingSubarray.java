import java.util.*;

public class SmallestIncreasingSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minLength = Integer.MAX_VALUE;
        int minStart = -1;
        int currStart = 0;
        int currLength = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currLength++;
            } else {
                if (currLength >= 2 && currLength < minLength) {
                    minLength = currLength;
                    minStart = currStart;
                }
                currStart = i;
                currLength = 1;
            }
        }
        if (currLength >= 2 && currLength < minLength) {
            minLength = currLength;
            minStart = currStart;
        }
        if (minStart == -1) {
            System.out.println("No increasing sub-array exists.");
        } else {
            System.out.print("Smallest increasing sub-array: { ");
            for (int i = minStart; i < minStart + minLength; i++) {
                System.out.print(arr[i]);
                if (i < minStart + minLength - 1) System.out.print(", ");
            }
            System.out.println(" }");
        }
        scanner.close();
    }
}
