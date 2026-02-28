import java.util.Scanner;

class calculator{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("   ++++calculator----   ");
		
		System.out.println("   Enter the two integers : ");
		
		System.out.print("     Enter : ");
		
		int a = sc.nextInt();
		
		System.out.println();
		
		System.out.print("     Enter : ");
		
		int b = sc.nextInt();
		
		System.out.println("   Enter the arithmetic function you need to do : ");
		
		System.out.println("   Enter 1 to do sum");
		
		System.out.println("   Enter 2 to find difference ");
		
		System.out.println("   Enter 3 to find Product");
		
		System.out.println("   Enter 4 to divide");
		
		System.out.print("   Enter : ");
		
		int n = sc.nextInt();
	
		switch (n) {
			
			case 1:
					int sum = a + b;
					
					System.out.println("     The sum is " + sum);
					
					break;
					
			case 2:
					int diff = 0;
					
					if(a > b){
						diff = a - b;
					}
					
					else{
						diff = b - a;
					}
					
					System.out.println("    The difference is " + diff);
					
					break;
					
			case 3:
					int prod = a * b;
					
					System.out.println("   The product is " + prod);
					
					break;
					
			case 4:
					int div = 0;
					
					if(a > b){
						div = a / b;
					}
					
					else{
						div = b / a;
					}
					
					System.out.println("     The result is " + div);
					
					break;
					
			default:
					System.out.println("      Invalid input");
					
					break;
					
			}
	
		sc.close();	
	}
}

	
	
	