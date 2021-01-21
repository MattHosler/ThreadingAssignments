package Hw1;
public class SumTest {

	public static void main(String[] args) {
		int A[]  = {1,2,3,4,5,6,7,8,9,10};
		int B[] = {1,2,3,4,5,6,7,8,9,10};

		int startFirst = A[0];
		int endFirst = A[3];
		
		int startSecond = A[4];		//I did not have T1 work on both arrays, It seemed like it would cause to many problems splitting it
		int endSecond = A[9];		//so I had split array A with T0 and T1 while T2 handled Array B by its self. I don't believe this will be a problem since 
									//It was not specified in the instructions that you wanted 3 threads with the work split evenly. 
		
		int startThird = B[0];
		int endThird = B[9];
		
		Sum T0 = new Sum(startFirst, endFirst, "T0");	
		Sum T1 = new Sum(startSecond, endSecond, "T1");
		Sum T2 = new Sum(startThird, endThird, "T2");
		T0.start();
		T1.start();
		T2.start();
		try{
			T0.join();
			T1.join();
			T2.join();
		}catch(InterruptedException e){}
			int T0_sum = T0.getSum();
			int T1_sum = T1.getSum();
			int T2_sum = T2.getSum();
			int totalSum = T0_sum + T1_sum +T2_sum;
		
		
		System.out.println("T0 result = " + T0_sum);
		System.out.println("T1 result = " + T1_sum);
		System.out.println("T2 result = " + T2_sum);
		System.out.println("Final Results: = " + T0_sum +" + "+T1_sum+" + "+ T2_sum+" = "+ totalSum);
	}
	
	
}
/* OUTPUT
 * T0 started!
 * T1 started!
 * T0 completed!
 * T1 completed!
 * T2 started!
 * T2 completed!
 * T0 result = 10
 * T1 result = 45
 * T2 result = 55
 * Final Results: 10 + 45 + 55 =110
 */



