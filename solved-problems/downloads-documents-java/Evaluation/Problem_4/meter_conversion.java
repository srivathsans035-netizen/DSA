import java.util.Scanner;

class meter_conversion{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("       Enter the the meters : ");
		
		double meters = sc.nextDouble();
		
		double feet = meters * 3.28084;
		
		double inches = meters * 39.3701;
		
		double cm = meters * 100.00;
		
		System.out.println(meters + " meters is " + feet + " in feet \n" + inches + " in inches \n" + cm + " in cms ");
		
		sc.close();
	}
}

		