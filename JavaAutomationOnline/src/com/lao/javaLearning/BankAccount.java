package com.lao.javaLearning;

public class BankAccount {
     Long accountNumber=(long) 123322211;
     String Accountholdername="divakar";
     Integer accountbalance=500;
     public void accountbalance() {
    	 System.out.println("accountbalance"+accountbalance);
     }
     
	public static void main(String[] args) {
		
//classname objname=new classname();
		BankAccount account= new BankAccount();
		System.out.println(account.accountbalance); 
	}

}
