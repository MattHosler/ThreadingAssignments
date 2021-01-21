package printerS;

public class PrinterSTest {

	public static void main(String[] args) {
		PrinterS s1= new PrinterS(1,10);
		PrinterS s2= new PrinterS(11,20);
		s1.start();
		s2.start();
		System.out.println("END");

	}

}
