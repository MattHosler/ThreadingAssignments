package printerS;

public class PrinterS extends Thread {
	private int from;
	private int to;
	
	public PrinterS(int from, int to) {
		this.from= from;
		this.to= to;
	}
	


	public void run() {
		for (int i = from; i <= to; i++) {
			System.out.print(i + "");
		}
		System.out.println();
	}

}
