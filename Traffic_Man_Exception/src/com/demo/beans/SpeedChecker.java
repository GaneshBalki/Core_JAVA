package com.demo.beans;

import com.demo.exception.SpeedLimitExceededException;

public class SpeedChecker {
	//declared static variavle for max and min speed limit 

    public static final int MIN_SPEED;
    public static final int MAX_SPEED;
    static {
    	
    	MIN_SPEED=50;
    	MAX_SPEED=90;
    }
    
    public static void validateSpeed(int speed) throws SpeedLimitExceededException {
    	//ckecking the speed given by user if Out of Limit 
    	if(speed<MIN_SPEED)
    		// created a objected of exception (checked exception),compiler forced us to handle the excetion
    		// current method will not handle the exception so delicated to calling method (which is main method from test class)
    		throw new SpeedLimitExceededException("You Are Below Speed Limit 50 km/hr : May Lead to Traffic Jam,Kindly speed up.");
    	if(speed>MAX_SPEED)
    		throw new SpeedLimitExceededException("You Exceeded the maximum speed limit May cause of Accident : It's a Warning ,Reduce Your Speed !");
    	//checking the continuation of proggram ;
    	
    	System.out.println("You Are A very good person Keep it up..Our Country needs People like you !!! ");
    	
    }
	

}
