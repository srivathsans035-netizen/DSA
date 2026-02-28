import java.util.Scanner;

class findMax{
	public static int largest(int[] arr, int n){
		int max;
		int key,j;
		for(int i = 1; i < n; i++){
			key = i;
			j = i - 1;
			while(j >= 0 && arr[j] > arr[key]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = arr[key];
		}
		max = arr[n-1];
		return max;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("Enter array elament " + i + " : ");
			arr[i] = sc.nextInt();
		}
		int max = largest(arr,n);
		System.out.println("Largest element : " +max);
		sc.close();
	}
}
				