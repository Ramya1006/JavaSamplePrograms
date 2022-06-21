package OverridingDemo;


class Demo {
	public int sum(int a , int b) {
		return a+b; 
	}
}
public class OverRidingExample extends Demo {

	public int sum(int a , int b) {
		return a+b;
		
	}
		
	public static void main(String[] args) {
		OverRidingExample ex = new OverRidingExample();
		int sum= ex.sum(10, 13);
		System.out.println(sum);
		
	}
}


