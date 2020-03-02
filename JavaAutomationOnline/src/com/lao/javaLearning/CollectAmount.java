package com.lao.javaLearning;

public class CollectAmount {

	public Integer amount=1000;
	
	
	
	public Integer mysoncollectamtAndGiveTome() {
		System.out.println("daddy have colleted the rupees"+amount+ "give it to me");
		return amount;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectAmount collection=new CollectAmount();
	Integer finalamt=collection.mysoncollectamtAndGiveTome();
	System.out.println("yes got it"+finalamt);
	}

}
