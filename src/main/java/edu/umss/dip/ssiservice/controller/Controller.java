package edu.umss.dip.ssiservice.controller;

import edu.umss.dip.ssiservice.repositories.CategoryRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class Controller {
    private CategoryRepository repository;

    public Controller(CategoryRepository repository) {
        this.repository = repository;
    }
    @RequestMapping("/employees")
    public String getEmployees(Model model) {
        model.addAttribute("employees", repository.findAll());
        return "employee";
    }

}
