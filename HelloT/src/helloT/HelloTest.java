package helloT;

public class HelloTest {

	//The main is it's own thread
	public static void main(String[] args) {
		HelloT t = new HelloT("my first Thread");
		t.start();


	}

}
