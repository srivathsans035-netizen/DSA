import java.util.Scanner;

class Substring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String : ");
        String str = sc.nextLine();

        int n = str.length();

        int l_s = 0;   
        int l_l = 0;  
        for (int i = 0; i < n; i++) {

            boolean[] seen = new boolean[256];
            int l = 0; 
            int s = i;

            for (int j = i; j < n; j++) {

                char c = Character.toLowerCase(str.charAt(j));

                if (seen[c]) {
                    break;
                }

                seen[c] = true;
                l++;
            }

            if (l > l_l) {
                l_l = l;
                l_s = i;
            }
        }

        for (int i = l_s; i < l_s + l_l; i++) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}
