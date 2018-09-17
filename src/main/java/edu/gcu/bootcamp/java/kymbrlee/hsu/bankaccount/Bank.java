package edu.gcu.bootcamp.java.kymbrlee.hsu.bankaccount;

import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	private String name;
	
	
	
	

	public static void main(String[] args) {
		
		Bank b = new Bank("GCU Credit Union");
		Saving s = new Saving("191923",5000.00);
		Checking c = new Checking("991773", 5000.00);
//		b.displayDepositSaving(s);
		b.displayMenu(c, s);
//		b.displayDepositChecking(c);
//		b.displayDepositSaving(s);
		b.doEndOfMonth(s);
//		System.out.println(s.getBalance());
		
	}
	
	private void displayMenu(Checking checking,Saving saving) {
		
		int option;
		do {
			System.out.println("=======================================");
			System.out.println("               MAIN MENU");
			System.out.println("           "+ this.name.toUpperCase());
			System.out.println("=======================================");
			System.out.println("Pick an option: ");		
			System.out.println("-----------------------");
			System.out.println(" 1: : Deposit to Checking");
			System.out.println(" 2: : Deposit to Savings");
			System.out.println(" 3: : Withdraw from Checking");
			System.out.println(" 4: : Withdraw from Savings");			
			System.out.println(" 5: : Get balance");	
			System.out.println(" 6: : Close month");
			System.out.println("------------------------");
			System.out.println(" 9: : Exit");
			option = sc.nextInt();
			this.actionMenu(option, checking, saving);
		} while (option != 9);
		
//		System.out.println("This is the display menu method");
		
	}
	private void actionMenu(int option, Checking checking, Saving saving) {
		
		
		switch (option) {
		
		case 1: checking.doDeposit();
				break;
		case 2: saving.doDeposit();
				break;
		case 3: checking.doWithdraw();
				break;
		case 4: saving.doWithdraw();
				break;
		case 5: this.displayBalanceScreen(checking, saving);
				break;
		case 6: this.doEndOfMonth(saving);
				break;
		case 9: System.out.println("You are leaving the Main Menu.");
					displayExitScreen();
				break;
		default: System.out.println("invalid int"); 
	
		}
//		System.out.println("This is the action menu method");
	}
	
	private void doEndOfMonth(Saving saving) {
		
		if(saving.getBalance()<saving.getMinBalance()) {
			saving.setBalance(saving.getBalance()-saving.getServiceFee());
			System.out.println("Your account fell below $200.00. You were assessed a $25.0 service fee. Your balance is $ "+ saving.getBalance());
		}else {
			
			saving.setBalance (saving.getBalance()*(saving.getinterestRate()/12)+saving.getBalance());
			System.out.println("Your balance is $ " + saving.getBalance());
			
		}
//		System.out.println("This is the doEndOfMonth method.");
		
	}
		
	
	private void displayExitScreen() {
//		System.out.println("This is the displayExitScreen method.");
		System.out.println("Good bye. Thank you for your business.");
	}
	private void displayBalanceScreen(Checking checking, Saving saving) {
		System.out.println("Your Checking account balance is $ " + checking.getBalance());
		System.out.println(":Your Savings account balance is $ " + saving.getBalance());
//		System.out.println("This is the displayBalanceScreen method");
		
	}
//	private void displayWithdrawSavings(Saving saving) {
//		saving.doWithdraw();
//		System.out.println("this is the displayWithdrawSavings method");
//	}
	
//	private void displayWithdrawChecking(Checking checking) {
//		checking.doWithdraw();
//		System.out.println("This is the displayWithdrawChecking method");
//	}
	
	private void displayDepositSaving(Saving saving) {
		 saving.doDeposit();
		
		
	}
	
	private void displayDepositChecking(Checking checking) {
			checking.doDeposit();
	}
	/**
	 *this is the constructor for the class Bank.
	 * @param name
	 */
	public Bank(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
