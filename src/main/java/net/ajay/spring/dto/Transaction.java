package net.ajay.spring.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION")
public class Transaction {

	@Id
	@Column(name="TRANSACTION_ID")
	@GeneratedValue
	private int transactionId;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID")
	private CustomerDetails customer;
	
	@OneToOne
	@JoinColumn(name="FROM_ACCOUNT")
	private Account fromAccount;
	
	@OneToOne
	@JoinColumn(name="TO_ACCOUNT")
	private Account toAccount;
	
	@Column(name="TRANSACTION_DESC")
	private String transactionDesc;
	
	@Column(name="TRANSACTION_AMT")
	private double transAmt;
	
	@Column(name="TRANSACTION_DATE")
	private Date transDate;
	
	@Column(name="TRANSACTION_STATUS")
	private String transStatus;
	
	/**
	 * @return the transStatus
	 */
	public String getTransStatus() {
		return transStatus;
	}
	/**
	 * @param transStatus the transStatus to set
	 */
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}
	/**
	 * @return the transactionId
	 */
	public int getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	/**
	 * @return the customer
	 */
	public CustomerDetails getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(CustomerDetails customer) {
		this.customer = customer;
	}
	/**
	 * @return the fromAccount
	 */
	public Account getFromAccount() {
		return fromAccount;
	}
	/**
	 * @param fromAccount the fromAccount to set
	 */
	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}
	/**
	 * @return the toAccount
	 */
	public Account getToAccount() {
		return toAccount;
	}
	/**
	 * @param toAccount the toAccount to set
	 */
	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}
	/**
	 * @return the transactionDesc
	 */
	public String getTransactionDesc() {
		return transactionDesc;
	}
	/**
	 * @param transactionDesc the transactionDesc to set
	 */
	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}
	/**
	 * @return the transAmt
	 */
	public double getTransAmt() {
		return transAmt;
	}
	/**
	 * @param transAmt the transAmt to set
	 */
	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}
	/**
	 * @return the transDate
	 */
	public Date getTransDate() {
		return transDate;
	}
	/**
	 * @param transDate the transDate to set
	 */
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	
	
	
}
