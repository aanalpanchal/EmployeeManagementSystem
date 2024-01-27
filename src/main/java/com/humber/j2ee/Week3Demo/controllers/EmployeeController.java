package com.humber.j2ee.Week3Demo.controllers;

import com.humber.j2ee.Week3Demo.entity.Employee;
import com.humber.j2ee.Week3Demo.services.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String getAllEmployee(Model model){
        model.addAttribute("employeeList", employeeService.getAllEmoloyees());
        return "index";
    }

    @GetMapping("/addEmployee")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "addEmployee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/editEmployee/{id}")
    public String editEmployee(@PathVariable(value = "id") int id, Model model){
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee",employee);
        return "updateEmployee";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

}
