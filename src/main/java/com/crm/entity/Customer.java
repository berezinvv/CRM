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
    private List<ContactPerson> contactPerson;
    private List<ContactNumber> contactNumber;
    private Address address;
    private List<String> typeActivity;
    private String AddInformation;

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

    public List<ContactPerson> getContactPerson() {
        return contactPerson;
    }

    public List<ContactNumber> getContactNumber() {
        return contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getTypeActivity() {
        return typeActivity;
    }

    public String getAddInformation() {
        return AddInformation;
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
                ", AddInformation='" + AddInformation + '\'' +
                '}';
    }
}
