import java.util.Scanner;
import java.util.ArrayList;

class average{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the size: ");

int n = sc.nextInt();

ArrayList<Integer> list = new ArrayList<>(n);

for(int i = 0; i < n; i++){

System.out.println("Enter the number: ");

list.add(sc.nextInt());

}

int sum = 0;

int avg = 0;

for(int i = 0; i < n; i++){

sum += list.get(i);

}

avg = sum/n;

System.out.println("The average is " + avg);

sc.close();

}

}

