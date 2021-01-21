package helloR;

public class HellotRTest {

	public static void main(String[] args) {
		HelloR r = new HelloR("my Second Thread");
		Thread t = new Thread(r);
		t.start();
		

	}

}
