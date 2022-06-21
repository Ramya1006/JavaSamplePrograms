package OverloadingDemo;

public class OverloadingExample {

	public int sum(int a , int b) {
		return a+b;
		
	}
	
	public int sum(int a , int b , int c) {
		return a+b+c; 
	}
	
	public static void main(String[] args) {
		
		OverloadingExample ex = new OverloadingExample();
		int sum= ex.sum(10, 13);
		System.out.println(sum);
		int value =ex.sum(3, 7, 9);
		System.out.println(value);
	}
}
