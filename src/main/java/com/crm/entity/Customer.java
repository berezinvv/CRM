package com.crm.entity;


import com.crm.common.Address;
import com.crm.common.ContactNumber;
import com.crm.common.ContactPerson;
import com.crm.common.TypeCustomer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "customers")
public class Customer {

    @Id
    private Integer id;
    private String name;
    private String fullName;
    private Integer codeOrganization;
    private TypeCustomer typeCustomer;
    private ContactPerson contactPerson;
    private ContactNumber contactNumber;
    private Address address;
    private String typeActivity;
    private String addInformation;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getCodeOrganization() {
        return codeOrganization;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public ContactNumber getContactNumber() {
        return contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public String getTypeActivity() {
        return typeActivity;
    }

    public String getAddInformation() {
        return addInformation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCodeOrganization(Integer codeOrganization) {
        this.codeOrganization = codeOrganization;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setContactNumber(ContactNumber contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTypeActivity(String typeActivity) {
        this.typeActivity = typeActivity;
    }

    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", codeOrganization=" + codeOrganization +
                ", typeCustomer=" + typeCustomer +
                ", contactPerson=" + contactPerson +
                ", contactNumber=" + contactNumber +
                ", address=" + address +
                ", typeActivity=" + typeActivity +
                ", AddInformation='" + addInformation + '\'' +
                '}';
    }
}
