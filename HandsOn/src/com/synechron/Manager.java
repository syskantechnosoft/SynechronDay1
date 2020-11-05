package com.synechron;

public class Manager extends Employee {
	public Manager(int employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
	}
	
	public void calculateTransportAllowance() {
		double ta;
		ta= (0.15*super.getBasicSalary());
		System.out.println("Transport Allownace for Manager is :"+ta);
	}
}
