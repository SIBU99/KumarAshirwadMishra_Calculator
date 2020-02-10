package calculator;
import java.util.Scanner;

public class Calc 
{
	public static void main(String args[])
	{
		
		double a,b,res;
		char choice=0;
		Scanner S=new Scanner(System.in);
		
		do
		{
			
			System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\n");
			System.out.print("Enter two numbers : ");
		    a=S.nextDouble();
		    b=S.nextDouble();
			System.out.print("Enter your choice : ");
			choice=S.next().charAt(0);
		
		    res=0;
			switch(choice)
			{ 
			    case '1':	
			    	Addition ad =new Addition();
			    	res = ad.addition(a, b);
			    	//System.out.print("Result : " +res);
			    break;
			     
			     case '2':
			    	Subtraction sub =new Subtraction();
			    	res = sub.subtration(a, b);
			    	//System.out.print("Result : " +res);
	
				 break;
				    
			     case '3':
			    	 Multiplication mul =new Multiplication();
				    res = mul.multiplication(a, b);
				    //System.out.print("Result : " +res);
			    
				 break;
				    
			     case '4':
			    	 Division div =new Division();
					 res = div.division(a, b);
			    	
				 break;
				   
			     case '5':
					 System.exit(0);
					 break;
				 default : 
					 System.out.print("Wrong Choice.....\n");
				 break;
			}
			System.out.println("Result : "+res);
			
			
	    }
		// loop works till the number 5 not selected.
	  while(choice!=5);
		S.close();
		
		
	}
}