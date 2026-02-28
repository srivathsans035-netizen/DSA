import java.util.Scanner;
class third_largest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the arraysize: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the array elements here");
		for(int i = 0; i < n; i++){
			System.out.println("ENTER : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for(int i : arr){
			System.out.print(i);
		}
		int ans = arr[n-3];
		if(n < 3){
			ans = -1;
		}
		System.out.println("The 3rd largest number is " + ans);
		sc.close();
	}
}
