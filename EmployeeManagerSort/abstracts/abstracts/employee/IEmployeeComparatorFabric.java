package abstracts.employee;

import java.util.Comparator;

import implementation.employee.Employee;

public interface IEmployeeComparatorFabric {
	
	public enum ComparatorType {
		Name,
		Salary,
		Number
	}
	
	public Comparator<Employee> create(ComparatorType type);
}

