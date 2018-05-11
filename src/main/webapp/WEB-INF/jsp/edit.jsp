<!DOCTYPE html>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value="../resources/css/bootstrap.css"/>"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../resources/css/bootstrap.min.css"/>"/>
    <script src="../resource/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
    <h1>Customer</h1>
    <form class="form-horizontal" method="POST" modelAttribute="customer">
    <table class = "table table-bordered">
        <tr>
            <td><label for="InputName">Name</label></td>
            <td><input type="text" class="form-control" id="InputName" placeholder="Name" name="name" value = "${customer.name}" /></td>
        </tr>
        <tr>
            <td><label for="InputFullName">Full name</label></td>
             <td><input type="text" class="form-control" id="InputFullName" placeholder="Full Name" name="fullName" value = "${customer.fullName}" /></td>
        </tr>
        <tr>
            <td><label for="InputCodeOrganization">Code organization</label></td>
            <td><input type="text" class="form-control" id="InputCodeOrganization" placeholder="Code organization" name="codeOrganization" value = "${customer.codeOrganization}" /></td>
        </tr>
        <tr>
            <td><label for="InputTypeCustomer">Type customer</label></td>
            <td>
                <label class="radio-inline">
                  <input type="radio" name="typeCustomer" path="typeCustomer" id="inlineRadio1" value="provider" <c:if test="${customer.typeCustomer=='provider'}">checked</c:if>> provider
                </label>
                <label class="radio-inline">
                  <input type="radio" name="typeCustomer" path="typeCustomer" id="inlineRadio2" value="buyer" <c:if test="${customer.typeCustomer=='buyer'}">checked</c:if>> buyer
                </label>
            </td>
        </tr>
        <tr>
            <td><label for="InputContactPerson">Contact person</label></td>
            <td>
                <label for="InputFirstName">First name</label>
                <input type="text" class="form-control" id="InputFirstName" placeholder="First name" name="contactPerson.firstName" value = "${customer.contactPerson.firstName}" />
                <label for="InputSecondName">Second name</label>
                <input type="text" class="form-control" id="InputSecondName" placeholder="Second name" name="contactPerson.secondName" value = "${customer.contactPerson.secondName}"/>
            </td>
        </tr>
        <tr>
            <td><label for="InputContactNumber">Contact number</label></td>
            <td>
                <input type="text" class="form-control" id="InputCountryCode" placeholder="Country code" name="contactNumber.countryCode" value = "${customer.contactNumber.countryCode}" />
                <input type="text" class="form-control" id="InputCityCode" placeholder="City code" name="contactNumber.cityCode" value = "${customer.contactNumber.cityCode}"/>
                <input type="text" class="form-control" id="InputNumber" placeholder="Number" name="contactNumber.number" value = "${customer.contactNumber.number}"/>
            </td>
        </tr>
        <tr>
            <td><label>Address</label></td>
            <td>
                <label for="InputAddress">Address</label>
                <input type="text" class="form-control" id="InputAddress" placeholder="Address" name="address.address" value = "${customer.address.address}" />
                <label for="InputCity">City</label>
                <input type="text" class="form-control" id="InputCity" placeholder="City" name="address.city" value = "${customer.address.city}" />
                <label for="InputRegion">Region</label>
                <input type="text" class="form-control" id="InputRegion" placeholder="Region" name="address.region" value = "${customer.address.region}" />
                <label for="InputPostalCode">Postal code</label>
                <input type="text" class="form-control" id="InputPostalCode" placeholder="Postal code" name="address.postalCode" value = "${customer.address.postalCode}" />
                <label for="InputCountry">Country</label>
                <input type="text" class="form-control" id="InputCountry" placeholder="Country" name="address.country" value = "${customer.address.country}" />
            </td>
        </tr>
        <tr>
            <td><label for="InputTypeActivity">Type activity</label></td>
            <td>
                <input type="text" class="form-control" id="InputTypeActivity" placeholder="Type ctivity" name="typeActivity" value = "${customer.typeActivity}" />
            </td>
        </tr>
       <tr>
            <td><label for="InputAddInformation">Add Information</label></td>
            <td><input class="form-control" id="InputAddInformation" name="addInformation" value = "${customer.addInformation}" /></td>
       </tr>

    </table>
    <div class="form-group">
        <div class="col-md-12 text-center">
            <button type="submit" class="btn btn-primary btn-lg">Save</button>
        </div>
    </div>
</form>
</body>
</html>
