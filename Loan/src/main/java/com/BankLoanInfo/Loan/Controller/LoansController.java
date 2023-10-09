package com.BankLoanInfo.Loan.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BankLoanInfo.Loan.Model.Loan;
import com.BankLoanInfo.Loan.service.LoanService;
import com.BankLoanInfo.Loan.service.LoanResponse;

@RestController
@RequestMapping("/loan")
public class LoansController {

	@Autowired
	private LoanService loanService;

	@GetMapping
	public List<Loan> getAllLoans() {
		return loanService.findAllLoans();
	}

	
	/*
	 * @GetMapping("/{id}") public ResponseEntity<LoanResponse>
	 * fetchLoanById(@PathVariable("id") Long id) { LoanResponse response =
	 * loanService.findLoanById(id); return ResponseEntity.ok(response); //return
	 * loanService.findLoanById(id); }
	 */
	 
	
	/*
	 * @GetMapping("/{id}") public Optional<Loan> fetchLoanById(@PathVariable("id")
	 * Long id) { return loanService.findLoanById(id); }
	 */
	
	 @GetMapping("/{id}")
	    private ResponseEntity<LoanResponse> getAccountDetails(@PathVariable("id") long id) {
	    	LoanResponse loanRes = loanService.getLoanById(id);
	        return ResponseEntity.status(HttpStatus.OK).body(loanRes);
	    }
	 
	 

	@PostMapping
	public Loan createLoan(@RequestBody Loan loan) {
		return loanService.addLoan(loan);
	}

	/*
	 * @PutMapping("/{id}") public Loan updateLoan(@PathVariable Long
	 * id, @RequestBody Loan loan) { return loanService.updateLoan(id, loan); }
	 * 
	 * @DeleteMapping("/{id}") public void deleteLoan(@PathVariable Long id) {
	 * loanService.deleteLoan(id); }
	 */

}
