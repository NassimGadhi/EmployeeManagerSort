package implementation.employee;

import java.util.Comparator;

public class ComparatorSalaryEmployee implements Comparator<Employee> {

	//@Override
	public int compare(Employee employee1, Employee employee2) {
		
		float employee1Salary = employee1.getAnnualSalary();
		float employee2Salary = employee2.getAnnualSalary(); 

		if (employee1Salary < employee2Salary) {  
			return -1;
		}
		else if (employee1Salary > employee2Salary) {
			return 1;
		}
		else {  
			return 0;
		} 
	}

}
