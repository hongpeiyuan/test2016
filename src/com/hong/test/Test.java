package com.hong.test;

public class Test {

	public static void main(String[] args) {
		System.out.println("����");
		/*ThreadSafeTest t=new ThreadSafeTest();
		Thread tA = new Thread(t);
		Thread tB = new Thread(t);
		Thread tC = new Thread(t);
		Thread tD = new Thread(t);
		tA.start();
		tB.start();
		tC.start();
		tD.start();*/
		
		new PrintHello().start();
		
	}

}
