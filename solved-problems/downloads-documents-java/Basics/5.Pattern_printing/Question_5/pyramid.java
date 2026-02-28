import java.util.Scanner;

class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size : ");
        int m = sc.nextInt();

        System.out.print("Enter the column size : ");
        int n = sc.nextInt();

        System.out.println("Pyramid of numbers");

        int mid = n / 2;
        int left = mid;
        int right = mid;

        for (int i = 0; i < m; i++) {

            int num = 1; 

            for (int j = 0; j < n; j++) {

                if (j >= left && j <= right) {
                    
                    System.out.print(num + " ");

                    
                    if (j < mid) {
                        num++;
                    } else {
                        num--;
                    }
                } else {
                    
                    System.out.print("  ");
                }
            }

            left--;
            right++;

            System.out.println();
        }

        sc.close();
    }
}
