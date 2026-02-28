import java.util.Scanner;
class fibonacci{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Fibonacci series : ");
		for(int i = 0; i <= 10; i++){
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}
}