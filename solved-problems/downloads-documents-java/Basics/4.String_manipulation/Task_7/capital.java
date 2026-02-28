import java.util.Scanner;
class capital{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		if(str.length() < 1){
			System.out.println("Invalid input!");
			return;
		}
		char [] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++){
			arr[i] = str.charAt(i);
		}
		
		arr[0] = Character.toUpperCase(arr[0]);
		System.out.print(arr[0]);	
		for(int j = 1; j < arr.length; j++){
			if(arr[j - 1] == ' '){
				arr[j] = Character.toUpperCase(arr[j]);
			}
			System.out.print(arr[j]);
		}
		sc.close();
	}
}
		
		