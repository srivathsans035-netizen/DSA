import java.util.Scanner;
class fibonacci{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		for(int i = 0; i < n; i++){
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}
}