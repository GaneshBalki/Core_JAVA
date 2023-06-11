import java.util.Scanner;

public class Catch {

	public Catch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s ="abcd";
		int arr[]= {1,2,3,4,5};
		int i=10;
 		try{
 			//System.out.println(s.charAt(5));//null pointer exception
 			System.out.println("Hello");
 		   // System.out.println(i/0); //arithmateic exceptiom
 		    System.out.println(arr[5]);  //ArrayIndexOutof BOund exception
 		}
// 		catch(StringIndexOutOfBoundsException e ) {
 		//single exception catch blocks
// 			System.out.println(e.getMessage());
// 		}catch(ArrayIndexOutOfBoundsException e) {
// 			System.out.println(e.getMessage());
// 		}
// 		catch( ArithmeticException e) {
// 			System.out.println(e.getMessage());
// 		}
// 		catch(ArrayIndexOutOfBoundsException | ArithmeticException e ) {
// 			System.out.println("Multiple Exception catch block");
// 		}
 		catch(Exception e) {
 			//this exception block is also called as generic block
 			//catch All exception block must be at the of all catch block if there any otherwise it will ce
 			//why Exception can handle all exceptions -->> bcause exception is superclass for all exceptions and parent class ref can store child class obj/reff
 			System.out.println(e.getMessage());
 			e.printStackTrace();
 		}
 		finally {
 			System.out.println("finally......... ");
 		}
 		System.out.println("Main Ends");
 		
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter Your Full Name : ");
 		System.out.println("Hello, "+sc.nextLine());
	}

}
