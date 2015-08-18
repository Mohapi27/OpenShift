package com.openshift.mohapi.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;


@Namespaces(value={@Namespace("/User"),@Namespace("/")})
@Result(location="/employeePage.jsp")
@Actions(value={@Action(""),@Action("Home")})
public class HomeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
