import java.util.Scanner;

class range{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number between 1 and 100 : ");

int number = sc.nextInt();

if(number >= 1 && number <= 50){

System.out.println("The number is in lower half");

}

else if(number >= 51 && number <= 100){

System.out.println("The number is in upper half");

}

else{

System.out.println("Invalid number");

}

}

}
