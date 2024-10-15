package com.cg.eis.bean;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee(int id,String name,double salary,String designation) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.insuranceScheme=desig(designation);
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
	        this.insuranceScheme=desig(designation);
	    }

	    public String getInsuranceScheme() {
	        return insuranceScheme;
	    }
	    
	    public String desig(String designation) {
	    	if(designation.equalsIgnoreCase("Manager")) {
	    		return "Scheme 1";
	    	}
	    	else if(designation.equalsIgnoreCase("Team Lead")) {
	    		return "Scheme 2";
	    	}
	    	else if(designation.equalsIgnoreCase("Developer")) {
	    		return "Scheme 3";
	    	}
	    	else {
	    		return "No Scheme";
	    	}
	    }

	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: " + salary);
	        System.out.println("Employee Designation: " + designation);
	        System.out.println("Employee Insurance Scheme: " + insuranceScheme);
	    }
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
////		Employee emp=new Employee(26,"Ashwin",30000.00,"Tester");
////		emp.displayEmployeeDetails();
//
//		
//	}

}
