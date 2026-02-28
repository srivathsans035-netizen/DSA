import java.io.*;
import java.util.Scanner;

class Main{
	
	public static void main(String [] args){
		
		try{
			
        BufferedReader rdr = new BufferedReader(new FileReader("C:\\Users\\sriva\\Documents\\Java\\OOPS\\2.Medium\\Q3\\input.txt"));
		
		Scanner sc = new Scanner(rdr);
		
		String line;
		
		while(sc.hasNext()){
			
			String word = sc.next();
			
			Words w = new Words(word);
			
			Words.addWord(w);
			
		}
		
		rdr.close();
		sc.close();
		
		}
		 catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        catch (IOException e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
		
		Words.printList();
		
	}
}
		
		