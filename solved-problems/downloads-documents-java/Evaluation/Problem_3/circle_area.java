import java.util.Scanner;

class circle_area{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("          Enter the radius of the circle : "); 
		
		int radius = sc.nextInt();
		
		System.out.println();
		
		double area = 3.14 * (radius * radius);
		
		System.out.println("          Area of the circle is : " + area);
		
		sc.close();
		
	}
	
}
		