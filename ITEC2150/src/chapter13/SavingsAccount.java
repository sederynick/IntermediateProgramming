package chapter13;

public class SavingsAccount extends BankAccount {
	private double annualInterestRate;

	public SavingsAccount(int accountNumber, double balance, double accountMaintenanceFee, double annualInterestRate) {
		super(accountNumber, balance, accountMaintenanceFee);
		this.annualInterestRate = annualInterestRate;
	}
	
	@Override
	public double deductAccountMaintenanceFee() {
		// TODO Auto-generated method stub
		//If the balance drops below 250.0 then deduct fee
		if (this.getBalance() < 250.0)
			return super.withdraw(250.0);
		else 
			return this.getBalance();
		
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	@Override
	public String toString() {
		return "SavingsAccount [annualInterestRate=" + annualInterestRate + ", toString()=" + super.toString() + "]";
	}
	
	public double wihtdraw(double amount) {
		if (amount > getBalance()) {
			return getBalance();
		}
		else {
			return super.withdraw(amount);
		}
	}
	
	public double getMonthlyInterest() {
		return annualInterestRate / 1200.0 *getBalance();
	}
	
	public double addmonthlyInterest() {
		return deposit(getMonthlyInterest());
	}

	

}
