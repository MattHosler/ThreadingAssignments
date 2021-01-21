package Hw1;

public class Sum extends Thread {
	private int from;
	private int to;
	private int total;
	private String name;
	
	public Sum (int from, int to, String name) {		//Decided to just manually input the name of the Thread, since if I just used 
														//Thread.currentThread() it would return Thread[Thread-1,5,main]. I needed the named thread
		this.from = from;
		this.to = to;
		this.name= name;
	}//Constructor
	
	public int getSum() {
		return total;
	}//get Sum

	
	public void run() {
		System.out.println( name +" started!");
		total = 0;
		for(int i = from; i <= to; i++)
			total += i;
		System.out.println(name +" completed!");
		
		
	}//run

}//Sum Class
