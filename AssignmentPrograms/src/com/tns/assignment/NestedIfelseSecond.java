package com.tns.assignment;

public class NestedIfelseSecond {

	public static void main(String[] args) {
		 int x = 10;
		  
		  //ifelse
		  if (x==1) 
		  { 
			  System.out.println("The value of x is 1"); 
		  } 
		  else if(x==2) 
		  {
			  System.out.println("The value of x is 2"); 
		  } 
		  else if(x==3)
		  { 
			  System.out.println("The value of x is 3"); 
		  } 
		  else 
		  {
			  System.out.println("The value of x is other than 1,2,3"); 
		  }
		  
		  
		  //switch case
		  switch (x) 
			{
			case 1: 
				System.out.println("The value of x is 1");
				break;
			case 2:
				System.out.println("The value of x is 2");
				break;
			case 3:
				System.out.println("The value of x is 3");
				break;
			default:
				System.out.println("The value of x is other than 1,2,3");
				break;

			}


	}

}
