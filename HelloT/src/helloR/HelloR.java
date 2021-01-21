package helloR;

public class HelloR implements Runnable{
	private String name; 
	
	public HelloR(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello from " + name);
		}
	}

}
