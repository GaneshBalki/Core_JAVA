package UserLogin_passWord;

import java.util.Scanner;

public class Login {
   public static int passWord() throws Exception {
	   Scanner sc=new Scanner(System.in);
	   
		   System.out.println("Enter PassWord ");
		   try {
			   int pass=sc.nextInt();
			   return pass;
		   }
		   catch(Exception e) {
			   throw new Exception("PassWord Must be Integer");  
		   }
		   
	      
	   
   }
	
	
	public static void main(String[] args) {
		int count=0,pass=0;
		while(count<3) {
			try (Scanner sc = new Scanner(System.in)){
				System.out.println("Enter UserId : ");
				String id=sc.next();
				try {
					pass=passWord();
					System.out.println("\tID :"+id+" PassWord : "+pass);
					break;
				}
				catch(Exception r) {
					System.out.println(r.getMessage());
				}
				
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
			++count;
		}
	}
}
