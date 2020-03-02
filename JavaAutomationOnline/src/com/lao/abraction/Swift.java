package com.lao.abraction;

public class Swift extends Car {
	@Override
	public void engineSecret() {
		System.out.println("this is a engine secret swift");
	}
@Override
public void companyVault() {
	System.out.println("this is a company vault swift");
}

	
	
	public static void main(String[] args) {
		
		
		Car car=new Swift();
		car.engineSecret();
		car.companyVault();
		

	}

}
