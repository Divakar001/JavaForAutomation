package com.lao.abraction;

public class I10 extends Car implements UpComingProjects, Interface2{
@Override
	public void engineSecret() {
		System.out.println("this is a engine secret I10");
	}
@Override
public void companyVault() {
	System.out.println("this is a company vault I10");
}


	public static void main(String[] args) {
		Car car=new I10();
car.engineSecret();
car.companyVault();
	}
	
	
	@Override
	public void employee() { 
		System.out.println("best employee");
		
	}

}
