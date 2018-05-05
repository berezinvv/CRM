package com.crm.controller;


import com.crm.common.TypeCustomer;
import com.crm.entity.Customer;
import com.crm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CRMController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/test")
    public String test() {
        return "Done";
    }

    @RequestMapping("/testAdd")
    public String testAdd() {

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Маяк,ООО");
        customer.setFullName("Товариство з обмеженою відповідальністю \"Маяк\"");
        customer.setCodeOrganization(30852309);
        customer.setTypeCustomer(TypeCustomer.buyer);
        List<String> typeActivityList = new ArrayList<>();
        typeActivityList.add("Зерно");
        typeActivityList.add("Семена");
        customer.setTypeActivity(typeActivityList);
        customerRepository.save(customer);

        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setName("Батькивщина, АФ НВП ТОВ");
        customer1.setFullName("Товариство з обмеженою відповідальністю\"Сільськогосподарське  науково-виробниче підприємство Батьківщина\"                                                                           ");
        customer1.setCodeOrganization(36204642);
        customer1.setTypeCustomer(TypeCustomer.buyer);
        typeActivityList.clear();
        typeActivityList.add("Зерно");
        typeActivityList.add("Семена");
        typeActivityList.add("ГП");
        customer1.setTypeActivity(typeActivityList);
        customerRepository.save(customer1);
        return "Done";
    }

    @RequestMapping("/find")
    public Customer findByParam(@RequestParam("codeOrg") Integer codeOrg) {

        if (codeOrg != 0) {
            Customer customer = customerRepository.findByCodeOrganization(codeOrg);
            if (customer == null) {
                return new Customer();
            }
            return customer;
        }
        return new Customer();
    }

    @RequestMapping("/findAll")
    public List<Customer> findAllByParam(@RequestParam("typeCustomer") TypeCustomer typeCustomer,
                                         @RequestParam("typeActivity") String typeActivity) {

        List<String> typeActivityList = new ArrayList<String>();

        if (typeCustomer != null && !typeActivity.isEmpty()) {
            typeActivityList.clear();
            typeActivityList.add(typeActivity);
            return customerRepository.findByTypeCustomerAndTypeActivityIn(typeCustomer, typeActivityList);
        }

        if (typeCustomer != null) {
            return customerRepository.findByTypeCustomer(typeCustomer);
        }

        if (!typeActivity.isEmpty()) {
            typeActivityList.clear();
            typeActivityList.add(typeActivity);
            return customerRepository.findByTypeActivityIn(typeActivityList);
        }

        return new ArrayList<Customer>();
    }
}
