package com.BankLoanInfo.Loan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long loanId;

	private String accountNumber;

	private String mobileNumber;

	private String loanNumber;

	private String loanType;

	private double loanAmount;
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	private double rateOfInterest;
	
	private Long accountId;

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getaccountNumber() {
		return accountNumber;
	}

	public void setaccountNumber(String accountNumber) {
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

	public void setLoanAmount(double sanctionAmount) {
		this.loanAmount = sanctionAmount;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", accountNumber=" + accountNumber + ", mobileNumber=" + mobileNumber + ", loanNumber="
				+ loanNumber + ", loanType=" + loanType + ", loanAmount=" + loanAmount + "]";
	}
}
