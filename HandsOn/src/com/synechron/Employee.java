package com.synechron;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	private double specialAllowance = 25.80;
	private double hra = 10.50;

	// default constructor
	public Employee() {
		super();
	}

	// partially parameterised constructor
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
	}

	// partially parameterised constructor
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}

	// fully parameterised constructor
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		this.hra = hra;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeePhone=" + employeePhone + ", basicSalary=" + basicSalary
				+ ", specialAllowance=" + specialAllowance + ", hra=" + hra + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basicSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((employeeAddress == null) ? 0 : employeeAddress.hashCode());
		result = prime * result + (int) (employeeId ^ (employeeId >>> 32));
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + (int) (employeePhone ^ (employeePhone >>> 32));
		temp = Double.doubleToLongBits(hra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(specialAllowance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(basicSalary) != Double.doubleToLongBits(other.basicSalary))
			return false;
		if (employeeAddress == null) {
			if (other.employeeAddress != null)
				return false;
		} else if (!employeeAddress.equals(other.employeeAddress))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeePhone != other.employeePhone)
			return false;
		if (Double.doubleToLongBits(hra) != Double.doubleToLongBits(other.hra))
			return false;
		if (Double.doubleToLongBits(specialAllowance) != Double.doubleToLongBits(other.specialAllowance))
			return false;
		return true;
	}

	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * (specialAllowance / 100)) + (basicSalary * (hra / 100));
		System.out.println("Calculated Salary is :"+ salary);
	}
	
	public void calculateTransportAllowance() {
		double ta;
		ta= (0.1*basicSalary);
		System.out.println("Transport Allownace for Employee is :"+ta);
	}

}
