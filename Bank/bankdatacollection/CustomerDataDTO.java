package com.thoughtfocus.bankdatacollection;

public class CustomerDataDTO {
	
	private String name;
	private long contactnumber;
	private String emailid;
	private long accountnumber;
	private String ifsccode;
	private float balance;
	private AddressDTO address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerDataDTO [name=" + name + ", contactnumber=" + contactnumber + ", emailid=" + emailid
				+ ", accountnumber=" + accountnumber + ", ifsccode=" + ifsccode + ", balance=" + balance + ", address="
				+ address + "]";
	}
	

}
