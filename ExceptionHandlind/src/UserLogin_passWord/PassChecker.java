package UserLogin_passWord;

import java.util.Scanner;

public class PassChecker {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			
			try{
				
				System.out.println("Enter Name : ");
				String name=sc.next();
				System.out.println("Enter Phone Number : ");
				int number=sc.nextInt();
				System.out.println("Hi, "+name);
				break;
			}
			catch(Exception e) {
				System.out.println(e);
				sc.nextLine();
			}
			
		}
		sc.close();
	}

}
