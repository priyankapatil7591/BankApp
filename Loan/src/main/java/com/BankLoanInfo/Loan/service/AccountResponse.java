package com.BankLoanInfo.Loan.service;

public class AccountResponse {
	 private Long id;
	    private String accountHolderName;
	    private String accountNumber;
	    private String mobileNumber;
	    private double balance;
	    
	    private LoanResponse loanResponse;
		
		public LoanResponse getLoanResponse() {
			return loanResponse;
		}
		public void setLoanResponse(LoanResponse loanResponse) {
			this.loanResponse = loanResponse;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getAccountHolderName() {
			return accountHolderName;
		}
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
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

}
