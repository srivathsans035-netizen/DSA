public final class Queue<T>{

    private Node head;
	private Node tail;
	private int counter = 0;
	
    private final class Node{
		
        private T data;
        private Node next;
		
		private Node(T val){
			data = val;
			next = null;
		}
		
		@Override
		public String toString(){
			return "Data : " + data + " ";
		}
		
    }

     Queue(){
            head = null;
			tail = null;
        }
	
	public void enqueue(T val){
		Node newNode = new Node(val);
		if(tail == null){
			head = newNode;
			tail = newNode;
			counter++;
		}
		
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			tail = newNode;
			counter++;
		}
	}
	
	public void dequeue(){
		if(head == null){
			throw new NullPointerException();
		}
		
		if(counter == 1){
			this.clear();
			return;
		}
		
		head = head.next;
		counter--;
	}
	
	public Node peek(){
		if(head == null){
			throw new NullPointerException();
		}
		
		return head;
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		return false;
	}
	
	public int size(){
		return counter;
	}
	
	public void clear(){
		head = null;
		tail = null;
		counter = 0;
		System.out.println("List cleared successfully");
	}
	
	//contains();
	//search();
	
	public void display(){
		if(this.isEmpty()){
			System.out.println("Empty list");
		}
		
		Node temp = head;
		while(temp != null){
			System.out.print(temp + ",");
			temp = temp.next;
		}
		System.out.println();
	}

}
