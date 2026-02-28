import java.util.Scanner;

class reverse{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the String: ");

String str = sc.nextLine();

char[] arr = str.toCharArray();

int i = 0;

int j = arr.length - 1;

while(j > i){

char temp = arr[i];

arr[i] = arr[j];

arr[j] = temp;

i++;

j--;


}

for(char u : arr){

System.out.print(u);

}

sc.close();

}

}