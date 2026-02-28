import java.util.Scanner;
class multiply{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int x = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		int y = sc.nextInt();
		if(x != y){
			System.out.print("Invalid input... To add or multiply two matrices their dimensions must be compatible");
			sc.close();
			return;
		}
		int [][] arr_1 = new int[x][y];
		int [][] arr_2 = new int[x][y];
		System.out.println("Enter the first matrix  ");
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				System.out.print("Enter : ");
				arr_1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix  ");
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				System.out.print("Enter : ");
				arr_2[i][j] = sc.nextInt();
			}
		}
		int [][] mul = new int[x][y];
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				mul[i][j] = arr_1[i][j] * arr_2[i][j];
			}
		}
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

		