class Pattern{

	public static void main(String [] args){

		int n = 5;

		//pattern11(n);

		//pattern10(n);

		pattern17(n);

	}

	private static void pattern10(int n){

                for(int i = 0; i < n; i++){

                        for(int space = 0; space < n - i; space++){
                                System.out.print(" ");
                        }

                        for(int star = 0; star <= i; star++){
                                System.out.print("* ");

                        }
                        System.out.println();
                }
        }



	private static void pattern11(int n){

		for(int i = 0; i < n; i++){

			for(int space = 0; space <= i; space++){
				System.out.print(" ");
			}

			for(int star = 0; star < n - i; star++){
				System.out.print("* ");

			}
			System.out.println();
		}
	}


	private static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
