package chapter13;

import java.util.Date;

public abstract class BankAccount {
	private int accountNumber;
	private double balance;
	private Date dateCreated;
	private double accountMaintenanceFee;

	public BankAccount(int accountNumber, double balance, double accountMaintenanceFee) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.dateCreated = new Date();
		this.accountMaintenanceFee = accountMaintenanceFee;
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", dateCreated=" + dateCreated
				+ ", accountMaintenanceFee=" + accountMaintenanceFee
				+ "]";
	}

	public double deposit(double amount) {
		return balance = amount + balance;

	}

	public double withdraw(double amount) {
		return balance = balance - amount;
	}

	public boolean transferFunds(BankAccount sourceAccount, double amount) {
		if (sourceAccount.balance == sourceAccount.withdraw(amount)) {
			return false;
		}
		else {
			deposit(amount);
			return true;
		}

	}
	
	//This method will be used to force the subclasses to implement a method that deducts maintenance fees.
	//To include an abstract method the class must be declared abstract
	//abstract classes need not have abstract methods.
	public abstract double deductAccountMaintenanceFee();
	
	public double getAccountMaintenanceFee() {
		return accountMaintenanceFee;
	}

}
