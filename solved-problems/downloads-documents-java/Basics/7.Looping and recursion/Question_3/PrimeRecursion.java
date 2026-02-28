import java.util.*;

class PrimeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isPrime(n, 2);
        System.out.println(result ? "Prime" : "Not Prime");
        sc.close();
    }

    static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }
}
