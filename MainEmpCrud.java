package com.pace.emp.crud.main;
import java.util.Scanner;
import com.pace.emp.crud.bean.Employee;
import com.pace.emp.crud.dao.EmployeeCrud;
public class MainEmpCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sadaf=new Employee(1234,"sadaf");
		Employee Asha=new Employee(1235,"Asha");
		Employee chandu=new Employee(1236,"chandu");
		Employee rehan=new Employee(1239,"rehan");
		Employee madhu=new Employee(1238,"madhu");
		Employee likitha=new Employee(1237,"likitha");
		EmployeeCrud empCrud=new EmployeeCrud();
		//send emp objects to addEmployee method
		
		empCrud.addEmployee(sadaf);
		empCrud.addEmployee(Asha);
		empCrud.addEmployee(chandu);
		empCrud.addEmployee(rehan);
		empCrud.addEmployee(madhu);
		empCrud.addEmployee(likitha);
		//display employee details
		empCrud.showEmpList();
		empCrud.removeEmployee(1238);
		empCrud.showEmpList();
		empCrud.searchEmployee(1235);

	}

}
