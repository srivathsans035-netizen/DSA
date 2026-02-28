import java.util.*;

public class Recursion {

    static void print1ToN(int n){
        if(n==0)return;
        print1ToN(n-1);
        System.out.print(n+" ");
    }

    static void countDown(int n){
        if(n==0)return;
        System.out.print(n+" ");
        countDown(n-1);
    }

    static int sumN(int n){
        if(n==0)return 0;
        return n+sumN(n-1);
    }

    static int sumBetween(int n,int m){
        if(n>m)return 0;
        return n+sumBetween(n+1,m);
    }

    static int sumDigits(int n){
        if(n==0)return 0;
        return n%10+sumDigits(n/10);
    }

    static String reverse(String s){
        if(s.length()==0)return s;
        return reverse(s.substring(1))+s.charAt(0);
    }

    static int fib(int n){
        if(n<=1)return n;
        return fib(n-1)+fib(n-2);
    }

    static int factorial(int n){
        if(n<=1)return 1;
        return n*factorial(n-1);
    }

    static int minArray(int[] arr,int n){
        if(n==1)return arr[0];
        return Math.min(arr[n-1],minArray(arr,n-1));
    }

    static int countEven(int[] arr,int n){
        if(n==0)return 0;
        return (arr[n-1]%2==0?1:0)+countEven(arr,n-1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)arr[i]=sc.nextInt();

        print1ToN(n);
        System.out.println();
        countDown(n);
        System.out.println();
        System.out.println(sumN(n));
        System.out.println(sumBetween(n,m));
        System.out.println(sumDigits(n));
        System.out.println(reverse(sc.next()));
        for(int i=0;i<n;i++)System.out.print(fib(i)+" ");
        System.out.println();
        System.out.println(factorial(n));
        System.out.println(minArray(arr,size));
        System.out.println(countEven(arr,size));
        sc.close();
    }
}

