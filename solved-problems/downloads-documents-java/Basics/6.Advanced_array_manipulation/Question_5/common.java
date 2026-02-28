import java.util.Scanner;
import java.util.HashSet;
class common{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first array size : ");
		int m = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int [] arr1 = new int[m];
		for(int i = 0; i < m; i++){
			System.out.print("Enter : ");
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the second array size : ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements : ");
		int [] arr2 = new int[n];
		for(int i = 0; i < n; i++){
			System.out.print("Enter : ");
			arr2[i] = sc.nextInt();
		}
		HashSet<Integer> list = new HashSet<>();
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(arr1[i] == arr2[j]){
					list.add(arr1[i]);
					break;
				}
				else{
					continue;
				}
			}
		}
		System.out.print("The common elements are : " + list);
		sc.close();
	}
}
