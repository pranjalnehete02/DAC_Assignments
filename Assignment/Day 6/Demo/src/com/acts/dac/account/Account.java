package com.acts.dac.account;

import java.time.LocalDate;

public class Account implements Comparable<Account>{

	private int accountNo;
	private String accName;
	private LocalDate dob;
	private double bal;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public Account(int accountNo, String accName, LocalDate dob, double bal) {
		super();
		this.accountNo = accountNo;
		this.accName = accName;
		this.dob = dob;
		this.bal = bal;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accName=" + accName + ", dob=" + dob + ", bal=" + bal + "]";
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.getAccountNo(),this.getAccountNo());
	}

}
