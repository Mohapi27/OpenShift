package com.openshift.mohapi.actions;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;


@Action(value="employee",results={@Result(name ="SUCCESS",location ="/employeePage.jsp")})
@Namespaces(value={ @Namespace("/User"),@Namespace("/")})
public class EmployeeAction {
	
	private String empName;
	private String empSurname;
	private String empContatctNumber;
	private String empEmail;
	private String empOccupation;
	
	
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
		String retValue = "";
		return retValue;
	}
	public void add(){
		
	}
	

}
