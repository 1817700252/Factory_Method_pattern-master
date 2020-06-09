package day05_demo03;

import day05_demo02.LeiFeng;

public class Main {
	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();
		student.buyRice();
		student.sweep();
		student.wash();
	}
}
