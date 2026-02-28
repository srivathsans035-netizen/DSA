class Main{
	
	public static void main(String [] args){
		
		TrafficSignal s1 = new RedSignal();
		
		s1.Signal();
		
		TrafficSignal s2 = new YellowSignal();
		
		s2.Signal();
		
		TrafficSignal s3 = new GreenSignal();
		
		s3.Signal();
		
		TrafficSignal s4 = new TrafficSignal();
		
		s4.Signal();
		
	}
	
}