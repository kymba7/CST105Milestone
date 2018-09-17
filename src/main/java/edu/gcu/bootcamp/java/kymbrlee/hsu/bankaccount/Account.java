package edu.gcu.bootcamp.java.kymbrlee.hsu.bankaccount;


import java.util.Scanner;

import edu.gcu.bootcamp.java.kymbrlee.hsu.bankaccount.Checking;
import edu.gcu.bootcamp.java.kymbrlee.hsu.bankaccount.Saving;
public class Account {
	
	Scanner sc = new Scanner(System.in);
	private String accountNum ;

	private double balance;
	
/**
 * gets balance
 * @return
 */
	
	public double getBalance() {
		return balance;
	}
	/**
	 * sets balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	/**
	 * withdraw method 
	 */
	public void doWithdraw() {
		double amount;
		System.out.print("Enter amount to be withdrawn: " +" $ ");
		amount =sc.nextDouble();

		this.setBalance(this.getBalance() - amount); 
		System.out.println("Your new balance is " + "$" + this.getBalance());
		 
	}
	/**
	 * deposit method
	 */
	public void doDeposit() {
		double amount;
		
		System.out.print("Enter amount to be deposited: ");
		amount =sc.nextDouble();
		this.setBalance(this.getBalance() + amount); 
		System.out.println("Your new balance is " + "$" + this.getBalance());
	}
	/**
	 * gets account number
	 * @return
	 */
	public String getAccountNum() {
		return accountNum;
	}
	/**
	 * sets account number
	 * @param accountNum
	 */
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
}
