import java.util.Scanner;

class calculateAverage{
	
	public static int average(int [] arr,int n){
		int avg = 0;
		for(int i = 0; i < n; i++){
			avg += arr[i];
		}
		avg = avg/n;
		return avg;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n = sc.nextInt();
		int arr [] = new int[n];
		System.out.println("Enter the array below");
		for(int i = 0; i < n; i++){
			System.out.print("Enter : ");
			arr[i] = sc.nextInt();
		}
		int ans = average(arr,n);
		clearScreen();
		System.out.println("The average of the array is : " + ans);
		sc.close();
	}
	
	public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
	}
}
