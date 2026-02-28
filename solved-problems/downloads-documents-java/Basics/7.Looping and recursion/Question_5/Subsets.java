import java.util.*;

class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Subsets:");
        generate(arr, 0, new ArrayList<>());
        sc.close();
    }

    static void generate(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        generate(arr, index + 1, current);


        current.remove(current.size() - 1);
        generate(arr, index + 1, current);
    }
}
