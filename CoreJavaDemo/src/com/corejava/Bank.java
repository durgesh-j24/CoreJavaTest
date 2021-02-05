package com.corejava;

public class Bank {

	public int bankId;
	public String bankName;
	
	
	
	public void getBankData() {
		
		bankId=101;
		bankName="ICICI Bank";
		
		System.out.println(bankId+" "+bankName);
		
	}
	
	public static void main(String[] args) {
		
		Bank b =new Bank();
		
		b.getBankData();
						
	}

}
