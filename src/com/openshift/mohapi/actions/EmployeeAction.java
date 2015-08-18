package com.openshift.mohapi.actions;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.openshift.mohapi.controller.EmployeeConfig;
import com.openshift.mohapi.model.Employee;


@Action(value="employeePage",results={@Result(name ="SUCCESS",location ="/employeePage.jsp")})
@Namespaces(value={ @Namespace("/User"),@Namespace("/")})
public class EmployeeAction {
	
	private String empName;
	private String empSurname;
	private String empContatctNumber;
	private String empEmail;
	private String empOccupation;
	
	private Employee epmloyee;
	private EmployeeConfig employeeConfig;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSurname() {
		return empSurname;
	}
	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}
	public String getEmpContatctNumber() {
		return empContatctNumber;
	}
	public void setEmpContatctNumber(String empContatctNumber) {
		this.empContatctNumber = empContatctNumber;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpOccupation() {
		return empOccupation;
	}
	public void setEmpOccupation(String empOccupation) {
		this.empOccupation = empOccupation;
	}
	
	public String execute() throws Exception
	{
		String retValue = "SUCCESS";
		int retCode = add();
		if(retCode==0)
		{
			retValue = "SUCCESS";
		}else{
			retValue = "ERROR";
		}
		return retValue;
	}
	public int add(){
		
		int retCode = 0;
		epmloyee.setEmpContatctNumber(empContatctNumber);
		epmloyee.setEmpEmail(empEmail);
		epmloyee.setEmpName(empName);
		epmloyee.setEmpOccupation(empOccupation);
		epmloyee.setEmpSurname(empSurname);
		
		
		System.out.println("Calling Add method");
		System.out.println(epmloyee.getEmpEmail());
		
		String value = employeeConfig.addEMployee(epmloyee);
		if(value.equals("SUCCESS")){
			retCode = 0;
		}
		else
		{
			retCode = -1;
		}
		return retCode;
	}
	public EmployeeAction() {
		epmloyee = new Employee();
		employeeConfig = new EmployeeConfig();
	}
	

}
