public final class LinkedList<T>{
	
	Node head;
	int counter;
	
	private final class Node{
		
		T data;
		Node next;
		
		private Node(T val){
			data = val;
			next = null;
		}
		
		public String toString(){
			return "Data : " + data + " , ";
		}
	}
	
	LinkedList(){
		head = null;
		counter = 0;
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		return false;
	}
	
	public int size(){
		return this.counter;
	}
	
	public void insert(T val){
		Node newNode = new Node(val);
		if(this.isEmpty()){
			head = newNode;
			counter++;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			counter++;
		}
	}
	
	public void insert(T val, int index){
		if(index < 1 || index > counter + 1){
			throw new IndexOutOfBoundsException();
		}
		else{
			Node newNode = new Node(val);
			if(index == 1){
				newNode.next = head;
				head = newNode;
				counter++;
			}
			else{
				Node temp = head;
				for(int i = 1; i < index - 1; i++){
					temp = temp.next;
				}
				newNode.next = temp.next;
				temp.next = newNode;
				counter++;
			}
		}
	}
	
	public void delete(int index){
		if(this.isEmpty()){
			throw new NullPointerException();
		}
		if(index < 1 || index > counter){
			throw new IndexOutOfBoundsException();
		}
		if(index == 1){
			head = head.next;
			counter--;
		}
		else{
			Node temp = head;
			for(int i = 1; i < index - 1; i++){
				temp = temp.next;
			}
			temp.next = temp.next.next;
			counter--;
		}
	}
	
	public void clear(){
		head = null;
		counter = 0;
	}
	
	//contains();
	//search();
	//update();
				
	public void display(){
		if(this.isEmpty()){
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp);
			temp = temp.next;
		}
		System.out.println();
	}
	
}