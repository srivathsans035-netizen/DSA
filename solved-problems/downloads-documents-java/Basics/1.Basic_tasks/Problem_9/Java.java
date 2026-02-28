import java.util.Scanner;

class Java{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the string: ");

String str = sc.nextLine();

if(str.contains("Java") || str.contains("java")){

System.out.println("The string contains Java");

}

else{

System.out.println("The string doesn't contains Java");

}

sc.close();

}

}