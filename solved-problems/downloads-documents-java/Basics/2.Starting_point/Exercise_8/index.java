import java.util.Scanner;

class index{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the array: ");
		int [] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number: ");
		int x  = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0; i < n; i++){
			if(arr[i] == x){
				flag = true;
				break;
			}
		}
			
		for(int i = 0; i < n; i++){
			if(arr[i] == x){
				System.out.println(i);
				break;
			}
			else{
				continue;
			}
		}
		if(flag == false){
				System.out.println("Invalid input");
			}
		sc.close();
	}
}