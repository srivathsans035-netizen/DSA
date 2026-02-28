import java.util.Scanner;

class palindrome{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the string: ");

String str = sc.nextLine();

int i = 0;
 
int j = str.length() - 1;

Boolean flag = true;

while(j > i){

if(str.charAt(i) != str.charAt(j)){

flag = false;

break;

}

else{

i++;
j--;


}

}

if(flag == false){

System.out.println("Not a Palindrome");

}

else{

System.out.println("Palindrome");

}

sc.close();

}

}



