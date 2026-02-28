import java.util.Scanner;

class reverse{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		int n = str.length();
		char [] arr = new char[n];
		for(int i = n - 1; i >= 0; i--){
			arr[i] = str.charAt(i);
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
		
		