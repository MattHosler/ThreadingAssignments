package MultiThreaded;

public class Sum extends Thread {
	private int from;
	private int to;
	private int total;
	
	public Sum (int from, int to) {
		this.from = from;
		this.to = to;
	}//Constructor
	
	public int getSum() {
		return total;
	}//get Sum
	
	public void run() {
		System.out.println("Thread[" +from + "," + to + "] started...");
		total = 0;
		for(int i = from; i <= to; i++)
			total += i;
		System.out.println("...Thread[" + from+ "," + to+ "] completed. (total = " + total + ")");
	}//run

}//Sum Class
