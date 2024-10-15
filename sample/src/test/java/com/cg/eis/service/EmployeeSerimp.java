package com.cg.eis.service;
import com.cg.eis.bean.*;
public class EmployeeSerimp implements EmployeeService {

	public void checkInsuranceScheme(Employee emp) {
		System.out.print(emp.getInsuranceScheme());
	}
	public void displayEmployeeDetails(Employee emp) {
		System.out.println(emp);
	}

}
