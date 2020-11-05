package com.synechron;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager(126534, "Peter", "Chennai India", 24986778, 65000);
		mgr.calculateSalary();
		mgr.calculateTransportAllowance();
		
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 42657856, 45000);
		trainee.calculateSalary();
		trainee.calculateTransportAllowance();
	}

}
