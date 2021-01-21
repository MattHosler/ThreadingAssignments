package printerS;

public class PrinterS2Test {

	public static void main(String[] args) {
		PrinterS2 s1 = new PrinterS2(1,10);
		PrinterS2 s2 = new PrinterS2(11,20);
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
		System.out.println("Fine");

	}

}
