package day05_demo03;

import day05_demo02.LeiFeng;
import day05_demo02.Undergraduate;

public class UndergraduateFactory implements IFactory{
	public LeiFeng createLeiFeng() {
		return new Undergraduate();
	}
}
