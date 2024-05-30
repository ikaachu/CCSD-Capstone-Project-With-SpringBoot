package com.capstone.ccsd.customer;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/customer/register")
    public String registerUser(Customer customer) {
        customer.setCustPassword(passwordEncoder.encode(customer.getCustPassword()));
        customerService.saveCustomer(customer);
        return "login";
    }

    @PostMapping("/customer/login")
    public String loginUser(@ModelAttribute Customer customer, Model model, HttpSession session) {
        Customer existingCustomer = customerService.findCustomerByEmail(customer.getCustEmail());
        if (existingCustomer == null || !passwordEncoder.matches(customer.getCustPassword(), existingCustomer.getCustPassword())) {
            model.addAttribute("error", "Invalid email or password.");
            return "login";
        }

        // Save the customer in the session
        session.setAttribute("customer", existingCustomer);

        return "redirect:/"; // Redirect to home page after successful login
    }
}
