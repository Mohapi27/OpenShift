package com.openshift.mohapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table(name="tblEmployee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empID")
	private int empId;
	@Column(name="empName")
	private String empName;
	@Column(name="empSurname")
	private String empSurname;
	@Column(name="empContactNumber")
	private String empContatctNumber;
	@Column(name="empEmail")
	private String empEmail;
	@Column(name="empOccupation")
	private String empOccupation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
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
	public Employee() {
	}
}
