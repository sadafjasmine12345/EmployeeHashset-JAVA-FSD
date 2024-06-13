package com.pace.emp.crud.dao;

import java.util.HashSet;

import com.pace.emp.crud.bean.Employee;

public class EmployeeCrud {
	HashSet<Employee>empSet=new HashSet<Employee>();
	public void addEmployee(Employee emp) {
		empSet.add(emp);
		
	}
	public void showEmpList(){ //in object to get values use getter
		for(Employee emp:empSet) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println("==================");
				
		}	
	}
	//remove operation
	public void removeEmployee(int id) {
		boolean isAvailable=false;
		for(Employee emp:empSet) {
			if(id==emp.getId()) {
				empSet.remove(emp);	//hidden logical facts instead of id use emp
				isAvailable=true;
				break;
			}		
		}
		if(isAvailable==true) {
			System.out.println("Employee with id"+id+"has been succesfully removed");
		}else {
			System.out.println("Employee with id"+id+"is unavailable");
		}
		
	}
	//search operation
	public void searchEmployee(int id) {
		boolean isContains=false;
		for(Employee emp:empSet) {
			if(id==emp.getId()) {
				isContains=true;
				break;
			}		
		}
		if(true) {
			System.out.println("Employee with id "+id+" has found");
		}else {
			System.out.println("Employee with id"+id+"is unavailable");
		}
		
	}
	

}
