package com.BankLoanInfo.Loan.service;

import com.BankLoanInfo.Loan.Model.Account;
import com.BankLoanInfo.Loan.Model.Loan;

public class LoanResponse {
	private Long loanId;

	private String accountNumber;

	private String mobileNumber;
	
	private AccountResponse accountResponse;

	public AccountResponse getAccountResponse() {
		return accountResponse;
	}

	public void setAccountResponse(AccountResponse accountResponse) {
		this.accountResponse = accountResponse;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	private String loanNumber;

	private String loanType;

	private double loanAmount;
}
