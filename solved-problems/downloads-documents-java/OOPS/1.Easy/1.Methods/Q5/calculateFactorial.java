import java.util.Scanner;

class calculateFactorial{
	
	public static int factorial(int x){
		
		if(x == 0){
			return 1;
		}
		
		return x * (factorial(x - 1));
	}
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find factorial : ");
		int x = sc.nextInt();
		x = factorial(x);
		System.out.println("The factorial is : " + x);
		sc.close();
	}
}