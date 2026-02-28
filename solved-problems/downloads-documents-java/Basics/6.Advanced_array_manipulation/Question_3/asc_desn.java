import java.util.Scanner;
class asc_desn{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n = sc.nextInt();
		System.out.println("Enter the array");
		int arr [] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("Enter : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i < n - 1; i++){
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.print("Ascending order ");
		for(int i : arr){
			System.out.print(i + " ");
		}
		int i = 0;
		int j = n - 1;
		while(j > i){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println();
		System.out.print("Descending order ");
		for(int k : arr){
			System.out.print(k + " ");
		}
		sc.close();
	}
}
		