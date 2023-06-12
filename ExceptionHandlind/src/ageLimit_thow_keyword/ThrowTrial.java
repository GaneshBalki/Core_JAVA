package ageLimit_thow_keyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowTrial {
    public static int Divide(int i,int j) throws Exception {
    if(j==0) {
    	throw new Exception("Can not Divide by zero");
    }
    	    int ans=i/j;
    	    return ans;
    	
    	
    }
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			int i=0,j=0;
			try {
				System.out.println("Enter num 1 :");
				i=sc.nextInt();
				System.out.println("Enter num 2 :");
				j=sc.nextInt();
				int ans=Divide(i,j);
				System.out.println("Ans is :: "+ans);
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}
			
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
