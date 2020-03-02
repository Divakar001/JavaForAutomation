package com.lao.javaLearning;

public class Employee {
	Integer emplyeeId;
	String Employeename;
	Employee(){
		emplyeeId=1;
		Employeename="divakar";
		System.out.println("employee object is created");
	}

	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println(employee.Employeename);

	}

}
