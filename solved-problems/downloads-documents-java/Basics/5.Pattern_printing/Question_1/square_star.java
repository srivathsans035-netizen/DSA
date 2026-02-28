import java.util.Scanner;
class square_star{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int m = sc.nextInt();
		System.out.print("Enter the column size : ");
		int n = sc.nextInt();
		System.out.println("Square pattern of stars");
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("* ");
			}
				System.out.println();
		}
		sc.close();
	}
}
			