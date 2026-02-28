import java.util.Scanner;

class greetings{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter your name here : ");

String name = sc.nextLine();

sc.close();

System.out.println("Welcome to Trainer Central " + name + " :) ");

}

}