import java.util.Scanner;
class transpose{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row : ");
		int m = sc.nextInt();
		System.out.print("Enter the column : ");
		int n = sc.nextInt();
		System.out.println("Enter the Matrix : ");
		int [][] mat = new int[m][n];
		int [][] trn = new int[n][m];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print("Enter : ");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix ");
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				trn[i][j] = mat[j][i];
			}
		}
		System.out.println("Transpose  ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				System.out.print(trn[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
		
