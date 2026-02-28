import java.util.Scanner;

class swap{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first element : ");
		
		int a = sc.nextInt();
		
		System.out.print("Enter the second element : ");
		
		int b = sc.nextInt();
		
		System.out.println("a = " + a + " b = " + b);

		a = a ^ b;
		
		b = a ^ b;
		
		a = a ^ b;
		
		System.out.println("a = " + a + " b = " + b);
		
		sc.close();
		
	}
	
}


		