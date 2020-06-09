package day05_demo01;

import day01_demo02.Operation;

public class AddFactory implements IFactory{
	public Operation createOperation() {
		return new Operation();
	}
}
