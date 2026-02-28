import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int l = n/2;
        int r = n/2;
        for(int i = 0; i < 2 * n- 1; i++){
            for(int j = 0; j < 2* n - 1; j++){
                if(j >= l && j <= r){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            if(i < n/2){
                l--;
                r++;
            }
            else{
                l++;
                r--;
            }
            System.out.println();
        }

    }
}
