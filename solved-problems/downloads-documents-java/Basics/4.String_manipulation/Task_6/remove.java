import java.util.Scanner;
class remove{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		char [] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++){
			if(str.charAt(i) != ' '){
				arr[i] = str.charAt(i);
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}
}