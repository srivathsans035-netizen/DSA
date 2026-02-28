import java.util.Scanner;

class Main{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your array size : ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter your array");
		
		for(int i = 0; i < n; i++){
			
			System.out.print("Enter : ");
			
			Array a = new Array(sc.nextInt());
			
			Array.addElement(a);
			
		}
		
		Array.printArray();
		
		System.out.println();
		
		System.out.println();
		
		Array.sortArray();
		
		Array.printArray();
		
		System.out.println();
		
		System.out.println();
		
		System.out.print("Enter the element to search : ");
		
		int s = sc.nextInt();
		
		System.out.println();
		
		Array.searchArray(s);
		
		sc.close();
		
	}
	
}