package ThreadDemo;

public class ThreadExampleTest {

	public static void main(String[] args) {
		ThreadExample thread1 = new ThreadExample();
		
		ThreadExample thread2 = new ThreadExample();
		thread1.setName("Ramya");
		System.out.println(thread1.getName());
		
		
		thread2.setName("PS");
		System.out.println(thread2.getName());
		thread1.start();
		thread2.start();
	}

}
