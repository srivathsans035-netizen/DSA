import java.util.Scanner;
class remove{
	public static void main(String [] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter your string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		char [] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++){
			arr[i] = str.charAt(i);
		}
		char [] arr2 = new char[str.length()];
		int i = 0;
		int j = 0;
		while(i < arr.length){
			if(arr[i] != Character.toLowerCase(ch) && arr[i] != Character.toUpperCase(ch)){
				arr2[j] = arr[i];
				i++;
				j++;
			}
			else{
				i++;
			}
		}
		String ans = new String(arr2);
		System.out.println(ans);
		sc.close();
	}
}