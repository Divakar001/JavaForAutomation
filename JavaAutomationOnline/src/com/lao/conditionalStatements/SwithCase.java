package com.lao.conditionalStatements;

public class SwithCase {

	String hero="ironman";
			public void heroOrNot() {
		switch (hero) {
		case "ironman": 
			System.out.println("superhero");
		case "superman":
			System.out.println("superhero");
			break;
		case "batman":
			System.out.println("superhero");
		break;	
			

		default:
			System.out.println("not super hero");
			}}
public static void main(String[] args) {
	SwithCase heroornot=new SwithCase();
	heroornot.heroOrNot();
	

	}

}
