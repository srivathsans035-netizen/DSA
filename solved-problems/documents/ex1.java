class ex1 {

	public static void main(String [] args){

		int n = 5;

		int [][] mat = new int [n][n];

		for(int = 0; i < n; i++){

			for(int j = 0; j < n; j++){

				mat[i][j] = Math.random() * 10;

			}

		}

		int s = 1;

		int row = 0;

		for(int i = 0; i < 2 *  n; i++){

			if(i < n){

				row = i;

				for(int j = 0; j <= i; j++){
					
					System.out.print(mat[row--][j]);
				}

			}

			else{

				row = n - 1;

				for(int k = s; k <= n - 1; k++){

					System.out.print(mat[row--][k]);

				}

				s++;
			}

			System.out.println();

		}

	}

}

			
