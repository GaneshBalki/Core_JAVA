package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.demo.beans.SpeedChecker;
import com.demo.exception.SpeedOutOfLimit;
public class SpeedTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Enter Speed...");
			int speed=sc.nextInt();
			SpeedChecker.validateSpeed(speed);
		} 
		catch (SpeedOutOfLimit e) {
			System.out.println("as : " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("asasas : " + e);
		}
		finally {
			sc.close();
		}
		
////		
//		int num;
//		Scanner sc1 = new Scanner(System.in);
//		try {
//			System.out.println("Enter a Number");
//			num=sc1.nextInt();
//		}
//		catch(InputMismatchException e){
//			System.out.println("Exception : "+e);
//
//		}
	

	}

}
