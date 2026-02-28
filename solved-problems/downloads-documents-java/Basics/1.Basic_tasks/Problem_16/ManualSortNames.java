import java.util.Scanner;

public class ManualSortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
