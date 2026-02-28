import java.util.Scanner;

class Interact{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("XO'TIC TAC TOE'OX");

        System.out.print("Player 1 should select yours first '( X / O )'\nEnter here : ");

        char p1 = sc.nextLine().charAt(0);

        char p2 = inputCheck(p1);

        int turn = 0;

        char [][] matrix = new char[3][3];

        int input = 0;

        int x = 0, y = 0;  

        boolean bool = false;

        int [] arr = new int[2];

        while(turn <= 9){
			
            System.out.println("Player1's turn");

            playerTurn(input,bool,matrix,p1,arr,x,y);
			
			display(matrix);

            turn++;

            turn = status(matrix,p1,turn);

            if(turn == -1){

                System.out.println("Player1 wins");

                break;
            }
			
			if(turn >= 9){
				
				System.out.print("It's a Tie");
				
				turn++;
				
				break;
				
			}

            System.out.println("Player2's turn");

            playerTurn(input,bool,matrix,p2,arr,x,y);

            turn++;

            display(matrix);

            turn = status(matrix,p2,turn);

            if(turn == -1){

                System.out.println("Player2 wins");

                break;
				
            }

        }
		
    }

    public static int status(char [][] matrix, char p,int turn){

        if(matrix[0][0] == p && matrix[0][1] == p && matrix[0][2] == p){
            return -1;
        }
        else if(matrix[1][0] == p && matrix[1][1] == p && matrix[1][2] == p){
            return -1;
        }
        else if(matrix[2][0] == p && matrix[2][1] == p && matrix[2][2] == p){
            return -1;
        }
        else if(matrix[0][0] == p && matrix[1][0] == p && matrix[2][0] == p){
            return -1;
        }
        else if(matrix[0][1] == p && matrix[1][1] == p && matrix[2][1] == p){
            return -1;
        }
        else if(matrix[0][2] == p && matrix[1][2] == p && matrix[2][2] == p){
            return -1;
        }
        else if(matrix[0][0] == p && matrix[1][1] == p && matrix[2][2] == p){
            return -1;
        }
        else if(matrix[0][2] == p && matrix[1][1] == p && matrix[2][0] == p){
            return -1;
        }
        else{
            return turn;
        }

    }

    public static char[][] update(int input, char [][] matrix, char p, int [] arr,int x, int y){

        arr = map(arr,input);

        x = arr[0];
        y = arr[1];

        matrix[x][y] = p;

        return matrix;
    }

    public static void display(char [][] matrix){

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                if(matrix[i][j] == '\0'){
                    System.out.print("  ");
                }
                else{
                    System.out.print(matrix[i][j] + " ");
                }
            }

            System.out.println();
        }
    }

    public static char inputCheck(char p1){

        char inp;

        if(p1 == 'X'){
            inp = 'O';
        }
        else{
            inp = 'X';
        }

        return inp; 
    }

    public static boolean positionCheck(int input, char [][] matrix,boolean bool,int arr[],int x, int y){

        arr = map(arr,input);

        x = arr[0];
        y = arr[1];

        if(matrix[x][y] != '\0'){
            bool = false;
        }

        return bool;
    }

    public static int userInput(int input){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        input = sc.nextInt();

        return input;
    }

    public static void playerTurn(int input, boolean bool, char [][] matrix, char p,int [] arr,int x, int y){

        bool = true;
        x = 0;
        y = 0;

        do{
            input = userInput(input);

            bool = positionCheck(input,matrix,bool,arr,x,y);

            if(!bool){
                System.out.println("Invalid input, please try a valid choice again");
            }
            else{
                matrix = update(input,matrix,p,arr,x,y);
            }

        } while(!bool);
    }

    public static int[] map(int arr[], int input){

        switch(input){

            case 1: arr[0]=0; arr[1]=0; return arr;
            case 2: arr[0]=0; arr[1]=1; return arr;
            case 3: arr[0]=0; arr[1]=2; return arr;
            case 4: arr[0]=1; arr[1]=0; return arr;
            case 5: arr[0]=1; arr[1]=1; return arr;
            case 6: arr[0]=1; arr[1]=2; return arr;
            case 7: arr[0]=2; arr[1]=0; return arr;
            case 8: arr[0]=2; arr[1]=1; return arr;
            case 9: arr[0]=2; arr[1]=2; return arr;

            default:
                System.out.println("Invalid input");
                return arr; 
        }
    }

}
