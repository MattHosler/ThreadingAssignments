package PrinterT;

public class PrinterTTestSequential {

	public static void main(String[] args) {
	PrinterT s1 = new PrinterT(1,10);
	PrinterT s2 = new PrinterT(11,20);
	s1.start();
	
	try {
		
		s1.join();
		s2.start();
		s2.join();
	} catch (InterruptedException e) {
		
	}
	System.out.println("END");
	}

}
