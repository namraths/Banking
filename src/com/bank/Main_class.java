package com.bank;
import java.util.*;

public class Main_class {

	public static void main(String[] args)  throws Exception {
		Scanner scan= new Scanner(System.in);
		int pin;
		String username;
		int ch;
		while(true)
		{
			System.out.println("");
			System.out.println("Welcome to India Bank");
			System.out.println("");
			System.out.println("Enter Details");
			System.out.println("1.Login");
			System.out.println("2.Create Account");
			System.out.println("3.Exit");
			System.out.println(" ");
			System.out.println("Thank You");
			
			      System.out.println("Enter the selected option");
			      ch=scan.nextInt();
			      if (ch==1) {
			    	  System.out.println("Enter your Full Name :");
			    	  username=scan.nextLine();
			    	  username+=scan.nextLine();
			    	  System.out.println("Enter pin");
			    	  pin=scan.nextInt();
			    	  AccessData transfer=new AccessData();
			    	  transfer.setUser_name(username);
			    	  transfer.setPin(pin);
			    	  AccountConnect access=new AccountConnect();
			    	  if(access.loginAccount(transfer)) {
			    		  System.out.println("Login Sucessful");
			    		  System.out.println("");
			    	  }
			    	  else {
			    		  System.out.println("Login Failed");
			    		  System.out.println("");
			    	  }
			    	 
			      }
			      else if(ch==2){
			    	  try {
			    		  System.out.println("Enter New User name");
			    		  username=scan.nextLine();
			    		  username+=scan.nextLine();
			    		  System.out.println("Enter pin");
			    		  pin=scan.nextInt();
			    		  AccessData transfer=new AccessData();
			    		  transfer.setUser_name(username);
			    		  transfer.setPin(pin);
			    		  AccountConnect access=new AccountConnect();
			    		  if(access.createAccount(transfer)) {
			    			  System.out.println("Account created Sucessfully");
			    			  System.out.println("");
			    		  }
			    		  else {
			    			  System.out.println("Failed");
			    			  System.out.println("");
			    		  }
			    	  }
			    	  catch(Exception e) {
			    			System.out.println("Please enter valid data");
			    			System.out.println("");
			    			break;
			    		}
			      }
			      else if(ch==3) {
			    	  System.out.println("Exit Sucessfully");
			    	  System.out.println("");
			      }
			      else {
			    	  System.out.println("Enter valid input");
			    	  System.out.println("");
			      }
		}

	}

}