<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>


<h3><i>OpenShift with Mohapi</i></h3>
 <s:actionerror/>
<s:form action="employeePage" method="post">
  
   <s:textfield name = "empName" label="First Name"/>
   <s:textfield name = "empSurname" label="Last Name"/>
   <s:textfield name = "empContatctNumber" label="Cell Number"/>
   <s:textfield name = "empEmail" label="Email Address"/>
   <s:textfield name = "empOccupation" label="Occupation"/>
   <s:submit value="Submit" />
</s:form>

<h2>List of Employees</h2>

<table>

  
  <tr>
     <th>Name</th>
     <th>Surname</th>
     <th>Email</th>
   </tr>
   
  <s:iterator value="empList"  var="employee">
    <tr>
        <td><s:property value="empName"/></td>
        <td><s:property value="empSurname"/></td>
        <td><s:property value="empEmail"/></td>
     </tr>
  </s:iterator>
</table>
</body>
</html>