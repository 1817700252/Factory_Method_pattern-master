package day05_demo03;

import day05_demo02.LeiFeng;

public class VolunteerFactory implements IFactory{
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}
}
