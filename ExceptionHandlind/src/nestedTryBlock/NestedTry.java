package nestedTryBlock;

public class NestedTry {
	
	public static void main(String[] args) {
		{
			//main try block  
			try    
			{    System.out.println("First Try block");
			    int num=10/1;    
			   
			         //try catch block within another try block  
			        try    
			           {    
			        	System.out.println("Second Try block");
			    	    int num2=10/2;       
			            //try catch block within nested try block  
			          
			    	      try    
			                {    
			    	    	  System.out.println("Third Try block");
			    	          int num3=10/3;      
			                }    
			              catch(Exception e2)    
			               {    
			                 System.out.println(e2.getMessage());
			               }    
			  
			           }    
			       catch(Exception e1)    
			       {    
			    	 System.out.println(e1.getMessage());
			       }    
			}    
			//catch block of parent (outer) try block  
		   catch(Exception e3)    
		    {    
			   System.out.println(e3.getMessage());
			}
			finally {
				System.out.println("Finnalyyyy");
			}
			  
		}
	}
}

