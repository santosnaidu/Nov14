package practisepkg;

import java.util.*;
public class stat {
	

	public static void main(String[] args) {

	
		int balance =50000,withdraw,deposit,numba;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("welcome to ATM Machine");
			System.out.println("1.WITHDRAW");
			System.out.println("2.DEPOSIT");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4.EXIT OPTION");
		
			numba =sc.nextInt();
			switch(numba) 
			{ 
			case 1:
			System.out.println("enter amount to be withdrawn");
			withdraw=sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance - withdraw;
				System.out.println("Balance amount is: ");
			} else {
				System.out.println("you dont have enough money");
			}
			System.out.println(" ");
			break;
			
			case 2:
				System.out.println("enter amount to be deposited");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("balance amount is: "+balance);
				System.out.println(" ");
				break;
			case 3:
				System.out.println("Balance of your account is: "+balance);
				System.out.println(" ");
				break;
			case 4:
			System.exit(0);
			System.out.println();
			System.out.println(" ");
			
		}
	}
}
}


	
	
	

	

	
	
	

		

		
		
			

	
		
	

