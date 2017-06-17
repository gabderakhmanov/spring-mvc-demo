package com.abg.springdemo.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by maxim on 6/17/17.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/customerForm")
    public String customerForm(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/customerProcessForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {

        if (theBindingResult.hasErrors()){
            return "customer-form";
        } else {
            return "customer-confirmation";
        }

    }

}
