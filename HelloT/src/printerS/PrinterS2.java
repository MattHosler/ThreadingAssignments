package printerS;

public class PrinterS2 implements Runnable {
	private int from;
	private int to;
	
	public PrinterS2(int from, int to) {
		this.from= from;
		this.to= to;
	}
	public void run() {
		for (int i = from; i <= to; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
