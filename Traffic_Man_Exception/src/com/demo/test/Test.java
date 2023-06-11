package com.demo.test;

import java.util.Scanner;

import com.demo.exception.SpeedLimitExceededException;

import static com.demo.beans.SpeedChecker.validateSpeed;

public class Test {

	public static void main(String[] args) {

		
			try (Scanner sc = new Scanner(System.in);) {
				System.out.println("Enter The Speed of Vehicle...");
				validateSpeed(sc.nextInt());
			}
			catch(SpeedLimitExceededException se) {
				System.out.println(se.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		

	}

}
