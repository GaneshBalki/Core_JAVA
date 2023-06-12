package com.demo.beans;

import com.demo.exception.SpeedOutOfLimit;

public class SpeedChecker {
	public final static int MIN_SPEED;
	public final static int MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=90;
	}
	
	public static void validateSpeed(Integer speed) throws SpeedOutOfLimit{
		
		if(speed<MIN_SPEED) {
			throw new SpeedOutOfLimit("Speed is below Minimun Speed Limit");
		}
		if(speed>MAX_SPEED) {
			throw new SpeedOutOfLimit("Exceeded the Maximum speed limit");
		}
		System.out.println("Speed in Limit.. ");
		
	}

}
