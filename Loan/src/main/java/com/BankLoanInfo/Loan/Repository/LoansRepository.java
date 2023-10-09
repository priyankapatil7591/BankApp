package com.BankLoanInfo.Loan.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankLoanInfo.Loan.service.LoanResponse;

public interface LoansRepository extends JpaRepository<com.BankLoanInfo.Loan.Model.Loan, Long> {

	//Optional<com.BankLoanInfo.Loan.Model.Loan> findByLoanId(Long loanId);

	LoanResponse findByLoanId(Long loanId);
}
