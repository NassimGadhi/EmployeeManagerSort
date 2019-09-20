package implementation.employee;


import abstracts.employee.IEmployeeComparatorFabric;
import java.util.Comparator;

public class ComparatorFabric implements IEmployeeComparatorFabric {

	@Override
	public Comparator<Employee> create(ComparatorType type) {
		Comparator<Employee> comparatorEmployee = null;
		switch(type) {
		case Name:
			comparatorEmployee = new ComparatorNameEmployee();
			break;
		case Salary:
			comparatorEmployee = new ComparatorSalaryEmployee();
			break;
		case Number:
			comparatorEmployee = new ComparatorNumberEmployee();
			break;
		}
		return comparatorEmployee;
	}
	
}
