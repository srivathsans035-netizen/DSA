import java.util.Scanner;

class Main{
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		LinkedList<String>list = new LinkedList<>();
		for(int i = 0; i < 10; i++){
			list.insert(sc.nextLine());
		}
		list.display();
		list.clear();
		list.display();
	}
	
}
		