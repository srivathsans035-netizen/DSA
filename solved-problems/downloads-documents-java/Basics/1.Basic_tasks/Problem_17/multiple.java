import java.util.Scanner;

class multiple{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter your number: ");

int num = sc.nextInt();

for(int i = 1; i <= 10; i++){

int ans = i * num;

System.out.println(i + " X " + num + " = " + ans);

}

sc.close();

}

}