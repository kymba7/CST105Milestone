package edu.gcu.bootcamp.java.kymbrlee.hsu.bankaccount;

public class Saving extends Account{
	private double interestRate = .06;
	private double minBalance = 200.00;
	private double serviceFee = 25.00;
	
	
	public Saving(String accountNum, double balance) {
		
		this.setBalance(balance);
		this.setAccountNum(accountNum);
		
	}

	
/**
 * this is the method that allows access to get interest rate.
 * @return
 */
	public double getinterestRate() {
		return this.interestRate;
	}
/**
 * this method allows the interest rate to be set.
 * @param interestRate
 */
	public void setinterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * this method adds the interest to the balance
	 * @param interestRate
	 * @return
	 */
	public double addInterest(double interestRate) {
		double newBalance = this.getBalance()+(this.getBalance() * this.interestRate /12);
		this.setBalance(newBalance);
		return  newBalance;
		
	}

/**
 * this gets service fee
 * @return
 */

	public double getServiceFee() {
		return this.serviceFee;
	}

/**
 * this sets service fee
 * @param serviceFee
 */

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}


/**
 * this gets min balance
 * @return
 */
	public double getMinBalance() {
		return minBalance;
	}

/**
 * this sets min balance
 * @param minBalance
 */

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

/**
 * this is the constructor for the class Saving
 * @param balance
 * @param account
 */

	public Saving(double balance, String account) {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
