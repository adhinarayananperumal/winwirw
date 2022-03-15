package com.entity.inheritanceexp.st;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="loanst")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="loan_type_dc", 
  discriminatorType = DiscriminatorType.STRING)
public class LoanST {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanId;
	
	private String loanType;
	
	private double loanAmt;
	
	private String status;
	
	
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
