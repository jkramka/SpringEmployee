package beans;

import java.util.Date;

public class Employee {
	private	long	id;
	private	String	employeeName;
	private	double	salary;
	private double  payIncrease;
	private	Date	accessTime;
	private	boolean	locked;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(long id, String employeeName, double salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.salary = salary;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getPayIncrease() {
		return payIncrease;
	}



	public void setPayIncrease(double payIncrease) {
		this.payIncrease = payIncrease;
	}



	public Date getAccessTime() {
		return accessTime;
	}



	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}



	public boolean isLocked() {
		return locked;
	}



	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	
	
}
