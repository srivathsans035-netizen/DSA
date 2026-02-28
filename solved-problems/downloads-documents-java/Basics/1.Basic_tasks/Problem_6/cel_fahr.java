import java.util.Scanner;

class cel_fahr{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the temperature in Celsius: ");

int cel = sc.nextInt();

int fahr = (cel * 9/5) + 32;

System.out.println(cel + " degree Celsius temperature is " + fahr + " degree Fahrenheit");

}

}