package com.cg.eis.bean;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee(int id,String Name,double salary,String designation,String insuranceScheme) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.insuranceScheme=insuranceScheme;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name=name;
	}
	
	 public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public String getDesignation() {
	        return designation;
	    }

	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }

	    public String getInsuranceScheme() {
	        return insuranceScheme;
	    }

	    public void setInsuranceScheme(String insuranceScheme) {
	        this.insuranceScheme = insuranceScheme;
	    }

	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: " + salary);
	        System.out.println("Employee Designation: " + designation);
	        System.out.println("Employee Insurance Scheme: " + insuranceScheme);
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee(26,"Ashwin",30000.00,"Tester","Scheme A");
		 emp.displayEmployeeDetails();

	        // Modifying employee's insurance scheme
	        emp.setInsuranceScheme("Scheme B");
	        System.out.println("\nUpdated Insurance Scheme: " + emp.getInsuranceScheme());
		
	}

}
