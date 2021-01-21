package PrinterT;

public class PrinterTTest {

		public static void main(String[] args) {
			PrinterT s1= new PrinterT(1,10);
			PrinterT s2= new PrinterT(11,20);
			s1.start();
			
			s2.start();
			System.out.println("END");

		}

	}
