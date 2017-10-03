package chapter13;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class CostDepositAccount extends SavingsAccount implements ActionListener {
	private int numberOfMonths;
	private boolean accountOpen;
	JFrame frame;
	JButton buttonAddInterest;
	JButton buttonDeductFee;
	JButton buttonCloseAccount;
	JLabel label;
	JPanel panel;
	
	

	public CostDepositAccount(int accountNumber, double balance, double accountMaintenanceFee,
			double annualInterestRate, int numberOfMonths, boolean accountOpen) {
		super(accountNumber, balance, accountMaintenanceFee, annualInterestRate);
		this.accountOpen=accountOpen;
		this.numberOfMonths=numberOfMonths;
		frame = new JFrame();
		buttonAddInterest = new JButton("Add Interest");
		buttonDeductFee = new JButton("Deduct Fee");
		buttonCloseAccount = new JButton("Close Account");
		
		buttonAddInterest.setPreferredSize(new Dimension(150,30));
		buttonDeductFee.setPreferredSize(new Dimension(150,30));
		buttonCloseAccount.setPreferredSize(new Dimension(150,30));
		
		buttonAddInterest.setFont(new Font("Arial", Font.BOLD, 16));
		buttonDeductFee.setFont(new Font("Arial", Font.BOLD, 16));
		buttonCloseAccount.setFont(new Font("Arial", Font.BOLD, 16));
		label = new JLabel(String.format("Balance:  " + this.getBalance()));
		label.setFont(new Font("Arial", Font.BOLD,18));
		
		frame.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-240,
				GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-55);
		frame.setSize(480, 110);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		
		panel = new JPanel();
		panel.add(buttonAddInterest);
		panel.add(buttonDeductFee);
		panel.add(buttonCloseAccount);
		panel.add(label);
		frame.add(panel);
		//registering this (cost deposit account object) with the buttons so 
		//that when any button is clicked, actionPerformed method will be called from this object
		buttonAddInterest.addActionListener(this);
		buttonDeductFee.addActionListener(this);
		buttonCloseAccount.addActionListener(this);
			
		
	}


	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public boolean isAccountOpen() {
		return accountOpen;
	}
	
	@Override
	public String toString() {
		return "CostDepositAccount [numberOfMonths=" + numberOfMonths + ", accountOpen=" + accountOpen + ", toString()="
				+ super.toString() + "]";
	}
	
	public double addMonthlyInterest() {
		if(numberOfMonths > 0 && accountOpen == true) {
			numberOfMonths--;
			return super.addmonthlyInterest();
		}
		else
			return this.getBalance();
		
	}
	
	public double deductAccountMaintenanceFee() {
		if (numberOfMonths > 0 && accountOpen==true) {
			numberOfMonths = 0;
			return this.withdraw(this.getAccountMaintenanceFee());	
		}
		else
			return this.getBalance();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}

}
a;
