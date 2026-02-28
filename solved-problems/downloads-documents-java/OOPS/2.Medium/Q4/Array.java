import java.util.ArrayList;

class Array{
	
	private int element;
	
	private static ArrayList <Array> arr = new ArrayList<> ();
	
	public Array(int element){
		
		this.element = element;
		
	}
	
	public void setElement(int element){
		
		this.element = element;
		
	}
	
	public int getElement(){
		
		return element;
		
	}
	
	public static void addElement(Array a){
		
		arr.add(a);
		
	}
	
	public static void printArray(){
		
		for(Array a : arr){
			
			System.out.print(a + " ");
			
		}
		
	}
	
	public static void sortArray(){
		
		for(int i = 1; i < arr.size(); i++){
			
			Array key = arr.get(i);
			
			int j = i - 1;
			
			while(j >= 0 && (arr.get(j).element) > key.element){
				
				arr.set(j+1,arr.get(j));
				
				j--;
				
			}
			
			
			arr.set(j+1,key);
			
		}
		
	}
	
	public static void searchArray(int x){
		
		int l = 0;
		
		int r = arr.size() - 1;
		
		while(l <= r){
			
			int mid =  l + (r - l) / 2;
			
			if(arr.get(mid).element == x){
				
				System.out.println("element found");
				return;
				
			}
			
			if(x < arr.get(mid).element){
				
				r = mid - 1;
				
			}
			
			else{
				
				l = mid + 1;
				
			}
			
		}
		
		System.out.println("Element Not found");
		
	}
	
	@Override
	public String toString(){
		
		return "" + element;
		
	}
	
}
	
		
		