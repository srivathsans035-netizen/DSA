import java.util.Scanner;
class largest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		System.out.println("Enter the array here ");
		int arr [] = new int[n];
		int larg = 0;
		for(int i = 0; i < n; i++){
			System.out.print("Enter : ");
			arr[i] = sc.nextInt();
			if(arr[i] > larg){
				larg = arr[i];
			}
		}
		System.out.print("The largest element is : " + larg);
		sc.close();
	}
}
				