package EmployeeProjectController.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import EmployeeEntity.Employee;
import EmployeeProjectService.Demo.EmpService;

@RestController
	@RequestMapping("/employees")
	public class EmpController {
	    private final EmpService employeeService;

	    @Autowired
	    public EmpController(EmpService employeeService) {
	        this.employeeService = employeeService;
	    }

	    public Employee CreateEmpList(Employee emp) {
	    	return employeeService.getEmpList(emp);
	    }
	    @GetMapping("/{empId}")
	    public Employee getEmployee(@PathVariable Long empId) {
	        return employeeService.getEmployeeById(empId);
	    }

//	    @PutMapping("/{empId}")
//	    public Employee updateEmployee(@PathVariable Long empId, @RequestBody Employee updatedEmployee) {
//	        return employeeService.updateEmployee(empId, updatedEmployee);
//	    }
	}



