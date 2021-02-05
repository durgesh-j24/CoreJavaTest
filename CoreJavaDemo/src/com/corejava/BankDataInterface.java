package com.corejava;


interface AccountData {
	
	public static int accountNo=12453;
	
	public abstract void getAccountDetails();

}
public class BankDataInterface implements AccountData{

	@Override
	public void getAccountDetails() {
		 
		 System.out.print(accountNo);
		
	}
	
	public static void main(String[] args) {
		
		BankDataInterface b =new BankDataInterface();
		
		b.getAccountDetails();
						
	}

}
