package com.lao.javaLearning;

public class Animals {
	String Animal_name;
	String Animal_type;
	
	Animals(String name,String type)
	{
		Animal_name=name;
		Animal_type=type;
		
		
	}
	
	public void sayaboutanimals() {
		 System.out.println("Animal name is "+Animal_name+"Animal type is "+Animal_type);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animals animals=new Animals("tiger", "king");
		animals.sayaboutanimals();
		Animals animals2=new Animals("fish","pet");
		animals2.sayaboutanimals();
		
	}

}
