package net.ajay.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT_TYPE")
public class AccountType {

	@Id
	@GeneratedValue
	@Column(name="ACCOUNT_TYPE_ID")
	private int AccountTypeId;
	
	@Column(name="ACCOUNT_TYPE")
	private String AccountType;
	
	@Column(name="ACCOUNT_DESC")
	private String AccountDesc;
	
	
	/**
	 * @return the accountTypeId
	 */
	public int getAccountTypeId() {
		return AccountTypeId;
	}
	/**
	 * @param accountTypeId the accountTypeId to set
	 */
	public void setAccountTypeId(int accountTypeId) {
		AccountTypeId = accountTypeId;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return AccountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	/**
	 * @return the accountDesc
	 */
	public String getAccountDesc() {
		return AccountDesc;
	}
	/**
	 * @param accountDesc the accountDesc to set
	 */
	public void setAccountDesc(String accountDesc) {
		AccountDesc = accountDesc;
	}
	
	
	
}
