package MultiThreaded;

public class SumTest {

	public static void main(String[] args) {
		int first = 1;
		int last = 100;
		int middle = (first + last) /2;
		Sum s1 = new Sum(first, middle);
		Sum s2 = new Sum(middle +1, last);
		s1.start();
		s2.start();
		try {
			s1.join();		//You have the joins in that way the main
			s2.join();		//doesn't print total before the threads are ready
		}
		catch(InterruptedException e) {}
		
		int s1_sum = s1.getSum();
		int s2_sum = s2.getSum();
		int total_sum = s1_sum + s2_sum;
		
		
		
		System.out.println("S1_sum = " + s1_sum);
		System.out.println("S2_sum = " + s2_sum);
		System.out.println("total sum = " + total_sum);


	}

}
