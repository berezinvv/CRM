package com.crm.controller;

import com.crm.entity.Customer;
import com.crm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest req) {

        List<Customer> customerList = customerRepository.findAll();

        model.addAttribute("customerList", customerList);

        return "index";
    }

    @RequestMapping(value = "/editCustomer/{id}", method = RequestMethod.GET)
    public String updateCustomer(Model model, @PathVariable("id") Integer id) {

        Customer customer = customerRepository.findById(id);
        if (customer == null) {
            model.addAttribute("customer", new Customer());
        }
        else {
            model.addAttribute("customer", customer);
            model.addAttribute("typeCustomer", customer.getTypeCustomer());
        }
        return "edit";
    }

    @RequestMapping(value = "/editCustomer/{id}", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {

        customerRepository.save(customer);

        return "redirect:/index";
    }

    @RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.GET)
    public String deleteCustomer(Model model, @PathVariable("id") Integer id) {

        Customer customer = customerRepository.findById(id);
        customerRepository.delete(customer);

        return "redirect:/index";
    }

}
