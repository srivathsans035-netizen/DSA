import java.util.Scanner;
import java.util.HashSet;

class distinct{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i = 0; i < n; i++){
			System.out.println("Enter :");
			arr[i] = sc.nextInt();
		}
		
		for(Integer i : arr){
			set.add(i);
		}
		
		System.out.print(set);
		sc.close();
	}
}
		
		