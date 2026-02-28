import java.util.Scanner;
class average{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		System.out.println("Enter the array here ");
		double arr [] = new double[n];
		double sum = 0;
		for(int i = 0; i < n; i++){
			System.out.print("Enter : ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		double avg = sum / n;
		System.out.print("Average of the double array is : " + avg);
		sc.close();
	}
}
				