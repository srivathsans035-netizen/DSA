import java.util.Scanner;
class reverse{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your array here");
		String [] arr = new String[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextLine();
		}
		int i = 0;
		int j = arr.length - 1;
		while(i < j ){
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("Array in reverse : ");
		for(i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
		