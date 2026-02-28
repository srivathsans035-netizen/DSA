class Main{
	
	public static void main(String [] args){
		
		Queue<Character>list = new Queue<>();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.enqueue('c');
		/*list.enqueue(1);
		list.enqueue(2);
		list.enqueue(3);
		list.enqueue(4);
		list.enqueue(5);
		list.display();
		list.dequeue();
		list.display();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.peek());
		//list.clear();
		System.out.println(list.size());
		list.dequeue();
		list.dequeue();
		list.dequeue();
		list.dequeue();
		*/
		
		list.display();
	}
	
}