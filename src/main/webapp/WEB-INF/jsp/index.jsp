<!DOCTYPE html>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="../resources/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../resources/css/bootstrap.min.css"/>"/>
</head>
<body>
    <h1>Customers</h1>
    <form action="/" method="get">
    <button type="submit" value = '/' class="btn btn-primary btn-sm">Add</button>
    <table class = "table table-striped">
        <tr>
            <td>#</td>
            <td>Name</td>
            <td>Code</td>
            <td>Type customer</td>
            <td>Type activity</td>
            <td></td>
         </tr>
         <tr>
            <td></td>
            <td></td>
            <td><input type="text" name="CodeOrg" id="CodeOrg" class="form-control input-sm"/></td>
            <td><input type="text" name="TypeCustomer" id="TypeCustomer" class="form-control input-sm"/></td>
            <td><input type="text" name="TypeActivity" id="TypeActivity" class="form-control input-sm"/></td>
            <td>

                    <button type="submit" class="btn btn-info">Search</button>

            </td>
         </tr>
         <c:forEach var="Customer" items="${customerList}">
           <tr>
             <td>${Customer.id}</td>
             <td>${Customer.name}</td>
             <td>${Customer.codeOrganization}</td>
             <td>${Customer.typeCustomer}</td>
             <td>${Customer.typeActivity}</td>
             <td>
                <a href="<c:url value='/editCustomer/${Customer.id}' />" class="btn btn-success custom-width">edit</a>
                <a href="<c:url value='/deleteCustomer/${Customer.id}' />" class="btn btn-danger custom-width">delete</a>
             </td>
           </tr>
          </c:forEach>
    </table>
    </form>
</body>
</html>
