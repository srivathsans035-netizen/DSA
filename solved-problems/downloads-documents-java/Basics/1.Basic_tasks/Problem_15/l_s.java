import java.util.Scanner;

class l_s{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the size: ");

int n = sc.nextInt();

int [] arr = new int[n];

System.out.println("Enter the elements of array: ");

for(int I = 0; I < n; I++){

System.out.println("enter the number: ");

arr[I] = sc.nextInt();

}

for(int i = 0; i < n - 1; i++){

for(int j = i + 1; j < n; j++){

if(arr[i] > arr[j]){

int temp = arr[i];

arr[i] = arr[j];

arr[j] = temp;

}

}

}

int largest = arr[n - 1];

int smallest = arr[0];

System.out.println("Largest number : " + largest + " and smallest number : " + smallest);

sc.close();

}

}






































