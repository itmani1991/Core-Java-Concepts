package io.github.anantharajuc;

public class VariableScope
{
	
	static int id = 123;
	

	public static void main(String[] args)
	{
		// Visible in main
		int n1 = 10; 
		
		System.out.println("in a method - Id = " + id);
		
		if(n1 == 10)
		{
			System.out.println("in a code block - Id = " + id);
			
		    // start new scope
			// visible only to this block 
		    int n2 = 20; 

		    // num1 and num2 both visible here.
		    System.out.println("n1 and n2 : "+ n1 +""+ n2);
		 }
		
	}
}
