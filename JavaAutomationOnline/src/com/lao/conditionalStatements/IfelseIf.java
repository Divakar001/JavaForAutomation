package com.lao.conditionalStatements;

public class IfelseIf {
	
	
	String mysuperhero="antman";
	
	public void	superherosgusser() {
		if(mysuperhero.equals("antman")){
			System.out.println("you thought about antman");
		}
		else if(mysuperhero.equals("batman")){
			System.out.println("you thought of batman");
		}
		else if(mysuperhero.equals("spiderman"))
		{
			System.out.println("you thought of spiderman");
		}
		else {
			System.out.println("sorrry");
		}
	}

	public static void main(String[] args) {
		
		IfelseIf guesswho=new IfelseIf(); 
		 guesswho.superherosgusser();

	}

}
