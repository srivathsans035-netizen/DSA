import java.util.Scanner;

class rotate{
	public static void rotate(int[] arr,int r){
		int n = arr.length;
		r = r % n;
		int index = 0;
		int temp [] = new int[n];
		for(int i = n - r; i < n; i++){
			temp[index++] = arr[i];
		}
		for(int i = 0; i < n - r; i++){
			temp[index++] = arr[i];
		}
		for(int i = 0; i < n; i++){
			arr[i] = temp[i];
		}
	}
		
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n = sc.nextInt();
		System.out.println("Enter the array : ");
		int arr [] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("Enter: ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Enter the number of times you want to rotate the array : ");
		int r = sc.nextInt();
		rotate(arr,r);
		for(int i : arr){
			System.out.print(i + " ");
		}
		sc.close();
	}
}
		