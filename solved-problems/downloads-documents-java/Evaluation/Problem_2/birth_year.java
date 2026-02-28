import java.util.Scanner;

class birth_year{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int curr_year = 2025;
		
		System.out.print("          Enter your age : " );
		
		int age = sc.nextInt();
		
		int brth_year = curr_year - age;
		
		System.out.print("          Yout Birht year is : " + brth_year);
		
		sc.close();
		
	}
		
}

		