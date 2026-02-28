import java.util.Scanner;
class sum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int [] arr = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			System.out.print("Enter : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("Sum of the array is : " + sum);
		sc.close();
	}
}
		
		