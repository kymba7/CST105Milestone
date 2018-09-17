package edu.gcu.bootcamp.java.kymbrlee.hsu.bankaccount;

public class Checking extends Account {
	
	private double overDraft = 45.00;
			
/**
 * gets overdraft
 * @return
 */
	public double getOverDraft() {
		return this.overDraft;
	}
/**
 * sets overdraft
 * @param overDraft
 */

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
	/**
	 * constructor for Checking class
	 * @param accountNum
	 * @param balance
	 */
	public Checking(String accountNum, double balance) {
		this.setAccountNum(accountNum);
		this.setBalance(balance);
		
		
	}
	/**
	 * withdraw method for checking overides the withdraw method in class Account
	 */
	public void doWithdraw() {
		
		double amount;
		System.out.print("Enter amount to be withdrawn: " +" $ ");
		amount =sc.nextDouble();
	if(this.getBalance() - amount <= 0){
		System.out.println(" You are overdrawn on your account an overdraft fee of $45.00 "
				+ "has been added to your account.");
				
		this.setBalance(this.getBalance()-amount - this.getOverDraft()); 
	}else {
		this.setBalance(this.getBalance()-amount);
	}
		System.out.println("Your new balance is " + "$" + this.getBalance());
	}
}
