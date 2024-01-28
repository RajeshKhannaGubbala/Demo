package EmployeeProject.Demo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import EmployeeEntity.Employee;
import EmployeeProjectController.Demo.EmpController;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	private EmpController empController;

//	@Test
//	void contextLoads() {
//	}	
	
	@Test
	public void employeeCheck() {
//		Employee ee = empController.getEmployee((long)1);
//		Mockito.mock(empController.getEmployee((long)1)).
//		assert.assertEquals(1.1,1.1);
	}

}
