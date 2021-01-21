package helloT;


//This is a thread
public class HelloT extends Thread {
	public HelloT(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println("Hello from " + getName());
		}
	}
}
