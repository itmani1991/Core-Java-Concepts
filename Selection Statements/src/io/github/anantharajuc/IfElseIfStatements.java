package io.github.anantharajuc;

public class IfElseIfStatements 
{
	public static void main(String[] args) 
	{
		int age = 100;
		
		if ( age >= 18 && age <=35 )
		{
			System.out.println( "age between 18-35 " );  			
		}           
        else if(age >35 && age <=60)
        {
        	System.out.println("age between 36-60");  
        }            
        else
        {
        	System.out.println( "not matched" );  
        }        	
	}
}