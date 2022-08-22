package com.tns.atm;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int balance = 100000;
		
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Welcome to Yes bank!");
			System.out.println("Choose 1 for Withdraw, 2 for Deposit, 3 for CheckBalance, 4 for Exit!");
			
			int choice = sc.nextInt();
			
			if(choice == 1) 
			{
				System.out.println("Withdraw Money");
			}
			
			if(choice == 2)
			{
				System.out.println("Deposit Money");
			}
			
			if(choice == 3)
			{
				System.out.println("Check Balance");
			}
			
			if(choice == 4)
			{
				System.out.println("Exit");
			}
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter the amount to be Withdraw:");
					int withdrawAmount = sc.nextInt();
					
					if(balance>=withdrawAmount) 
					{
						balance = balance - withdrawAmount;
						System.out.println("Balance amount is "+balance);
					}
					else
					{
						System.out.println("Insufficient Balance!");
					}
					break;
					
				case 2:
					System.out.println("Enter the amount to be Deposit:");
					
					int depositAmount = sc.nextInt();
					balance = balance + depositAmount;
					System.out.println("Balance Amount is "+balance);
					break;
					
				case 3:
					System.out.println("Your balance is " +balance);
					break;
					
				case 4:
					System.out.println("Thank You!");
					break;
					
			}
			
		}
}
