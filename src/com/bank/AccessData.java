package com.bank;

public class AccessData {
	public int account_no;
	public String user_name;
	public int pin;
	public String acc_balance;
	public AccessData(int account_no, String user_name,int pin, String acc_balance) {
		super();
		this.account_no=account_no;
		this.user_name=user_name;
		this.pin=pin;
		this.acc_balance=acc_balance;
		
	}
	public AccessData() {
		
	}
	public int getAccount_no() {
		return account_no;
	}
    public void setAccount_no(int account_no) {
    	this.account_no=account_no;
    }
    public String getUser_name() {
		return user_name;
	}
    public void setUser_name(String user_name) {
    	this.user_name=user_name;
    }
    public int getPin() {
		return pin;
	}
    public void setPin(int pin) {
    	this.pin=pin;
    }
    public String getAcc_balance() {
		return acc_balance;
	}
    public void setAcc_balance(String acc_balance) {
    	this.acc_balance=acc_balance;
    }
	
    

}
