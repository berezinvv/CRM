package com.crm.repository;

import com.crm.common.TypeCustomer;
import com.crm.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    public List<Customer> findByCodeOrganizationLike(Integer codeOrganization);

    public List<Customer> findByTypeCustomer(TypeCustomer typeCustomer);

    public List<Customer> findByTypeActivityIn(List<String> typeActivity);

    public List<Customer> findByTypeCustomerAndTypeActivityIn(TypeCustomer typeCustomer, List<String> typeActivity);

    public List<Customer> findAll();
}
