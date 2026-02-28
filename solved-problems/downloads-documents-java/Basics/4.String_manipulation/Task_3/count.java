import java.util.Scanner;
class count{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine().trim();
		if(str.isEmpty()){
			System.out.print("The number of word in the string is zero");
			sc.close();
			return;
		}
		int cnt = 1;
		int n = str.length();
		for(int i = 0; i < n; i++){
			char ch = str.charAt(i);
			if(ch == ' '){
				cnt+=1;
			}
		}
		System.out.print("The number of words in the string is " + cnt);
		sc.close();
	}
}
				