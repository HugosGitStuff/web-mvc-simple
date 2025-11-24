package io.codeforall.bootcamp.canifetes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// tell Spring this class is a controller now. Spring will automatically find it
@Controller
public class CustomerController {

    // map URL "/customer" to this method when GET request arrives
    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    public String showCustomer(Model model) {

        // model: create Customer object with data
        Customer customer = new Customer(1, "Hugo Ramalho", "hugo@email.com", "+351 968 567 589");

        // add customer to the model. Spring passes this to JSP automatically
        model.addAttribute("user", customer);

        // return the view name. Spring's ViewResolver will find "index.jsp"
        return "index";
    }
}