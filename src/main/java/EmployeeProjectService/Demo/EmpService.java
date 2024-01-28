package EmployeeProjectService.Demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EmployeeEntity.Employee;
import EmployeeProjectDAO.Demo.EmpDAO;
import EmployeeProjectDAO.Demo.EmployeeRepository;

@Service
	public class EmpService {
	    private final EmployeeRepository employeeRepository;

	    @Autowired
	    public EmpService(EmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }

	    public Employee getEmployeeById(Long empId){
	        return (Employee)employeeRepository.findByEmpId(empId).get();


	    }

		public Employee getEmpList(Employee emp) {
			
			return employeeRepository.save(emp);
		}

//	    public Employee updateEmployee(Long empId, Employee updatedEmployee) {
//	        Optional<Employee> employee = getEmployeeById(empId);
//	        employee.setName(updatedEmployee.getName());
//	        employee.setEmailId(updatedEmployee.getEmailId());
////	        employee.setEmpHireDate(updatedEmployee.getEmpHireDate());
//	        return employeeRepository.save(employee);
//	    }
	}



