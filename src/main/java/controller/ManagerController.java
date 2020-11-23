package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sevice.CustomerSevice;
import sevice.CustomerSeviceImpl;

import java.util.List;

@Controller
public class ManagerController {
    private CustomerSevice customerService = new CustomerSeviceImpl();

    @GetMapping
    public String index(Model model) {
        List customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/view";
    }
}