import java.util.Scanner;
class left_triangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int m = sc.nextInt();
		System.out.print("Enter the column size : ");
		int n = sc.nextInt();
		System.out.println("left triangle of stars");
		int cap = n - 1;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(j >= cap){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			cap--;
			System.out.println();
		}
		sc.close();
	}
}
			