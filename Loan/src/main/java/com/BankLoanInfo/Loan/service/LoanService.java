package com.BankLoanInfo.Loan.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.BankLoanInfo.Loan.Model.Account;
import com.BankLoanInfo.Loan.Model.Loan;

@Service
public class LoanService {
	@Autowired
	private com.BankLoanInfo.Loan.Repository.LoansRepository loanRepo;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ModelMapper mapper;

	
	/*
	 * public LoanResponse findLoanById(Long loanId) {
	 * 
	 * LoanResponse responseDto = new LoanResponse(); Loan loan =
	 * loanRepo.findById(loanId).get(); Loan userDto = mapToUser(loan);
	 * 
	 * ResponseEntity<Account> responseEntity = restTemplate
	 * .getForEntity("http://localhost:9092/Account/accounts/{id}" +
	 * loan.getLoanId(), Account.class);
	 * System.out.println("responseEntity="+responseEntity);
	 * 
	 * Account departmentDto = responseEntity.getBody();
	 * 
	 * System.out.println(responseEntity.getStatusCode());
	 * 
	 * //responseDto.setaccount(departmentDto); //responseDto.setloan(userDto);
	 * 
	 * return responseDto; }
	 */
	 
	public LoanResponse getLoanById(Long id) {
	   	 Optional<Loan> loan = loanRepo.findById(id);
	        LoanResponse loanResponse = mapper.map(loan, LoanResponse.class);
	        System.out.println("loanResponse="+loanResponse);
	        AccountResponse accResponse = restTemplate.getForObject("http://localhost:9092/Account/accounts/{id}", AccountResponse.class, id);
	       System.out.println("loanResponse="+loanResponse);
	       loanResponse.setAccountResponse(accResponse);
	  
	        return loanResponse;
	       //return accountRepository.findById(id);
	   }
	
	private Loan mapToUser(Loan user) {
		Loan userDto = new Loan();
		userDto.setLoanId(user.getLoanId());
		userDto.setLoanAmount(user.getLoanAmount());
		userDto.setaccountNumber(user.getaccountNumber());
		userDto.setLoanNumber(user.getLoanNumber());
		userDto.setLoanType(user.getLoanType());
		return userDto;
	}

	public com.BankLoanInfo.Loan.Model.Loan addLoan(com.BankLoanInfo.Loan.Model.Loan loan) {
		return loanRepo.save(loan);
	}

	
	  public Optional<com.BankLoanInfo.Loan.Model.Loan> findLoanById(Long id) {
	  return loanRepo.findById(id); }
	 

	public List<com.BankLoanInfo.Loan.Model.Loan> findAllLoans() {
		List<com.BankLoanInfo.Loan.Model.Loan> loan = loanRepo.findAll();
		loan.forEach(account -> System.out.println(loan.toString()));
		return loan;
	}

}
