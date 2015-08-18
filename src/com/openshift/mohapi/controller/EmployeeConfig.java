package com.openshift.mohapi.controller;

import org.hibernate.Session;

import com.openshift.mohapi.model.Employee;
import com.openshift.mohapi.util.HibernateUtil;

public class EmployeeConfig extends HibernateUtil{
	
	private Session session = null;
	public String addEMployee(Employee employee)
	{
		String retString = "";
		System.out.println("Our name is " + employee.getEmpName());
		try{
		session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		retString = "SUCCESS";
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return retString;
		
	}

}
