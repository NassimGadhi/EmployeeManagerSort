package implementation.employee;

import static org.junit.Assert.assertEquals;

import java.util.Comparator;

import org.junit.Test;

import abstracts.employee.IEmployeeComparatorFabric.ComparatorType;

public class ComparatorFabricTest {
	
	public static final String ANY_NAME = "Rita Matte";
	public static final float INITIAL_ANNUAL_SALARY = Employee.MAX_INITIAL_ANNUAL_SALARY;
	
	ComparatorFabric comparatorFabric = new ComparatorFabric();
	ComparatorNameEmployee comparatorNameEmployee = new ComparatorNameEmployee();
	ComparatorSalaryEmployee comparatorSalaryEmployee = new ComparatorSalaryEmployee();
	ComparatorNumberEmployee comparatorNumberEmployee = new ComparatorNumberEmployee();
	
	
	//Compare Name
	@Test
	public void comparatorName_WHEN_comparingTwoEmployeeName_THEN_returnMinusOne() {
		//Act
		Employee employee1 = new Employee("Amelie", INITIAL_ANNUAL_SALARY);
		Employee employee2 = new Employee("Jacob", INITIAL_ANNUAL_SALARY);
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Name);
		int nameComparator = compType.compare(employee1, employee2);
		//Assert
		int EXPECTED_COMPARE_RESULT = -1;
		assertEquals(EXPECTED_COMPARE_RESULT, nameComparator);
		
	}
	@Test
	public void comparatorName_WHEN_comparingTwoEmployeeName_THEN_returnOne() {
		//Act
		Employee employee1 = new Employee("Jacob", INITIAL_ANNUAL_SALARY);
		Employee employee2 = new Employee("Amelie", INITIAL_ANNUAL_SALARY);
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Name);
		int nameComparator = compType.compare(employee1, employee2);
		//Assert
		int EXPECTED_COMPARE_RESULT = 1;
		assertEquals(EXPECTED_COMPARE_RESULT, nameComparator);
	}
	@Test
	public void comparatorName_WHEN_comparingTwoEmployeeName_THEN_returnZero() {
		//Act
		Employee employee1 = new Employee("Jacob", INITIAL_ANNUAL_SALARY);
		Employee employee2 = new Employee("Jacob", INITIAL_ANNUAL_SALARY);
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Name);
		int nameComparator = compType.compare(employee1, employee2);
		//Assert
		int EXPECTED_COMPARE_RESULT = 0;
		assertEquals(EXPECTED_COMPARE_RESULT, nameComparator);
	}
	
	//Compare Salary
	@Test
	public void comparatorSalary_WHEN_comparingTwoEmployeeSalary_THEN_returnMinusOne() {
		//Act
		Employee employee1 = new Employee(ANY_NAME, 5000);
		Employee employee2 = new Employee(ANY_NAME, 8000);
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Salary);
		int salaryComparator = compType.compare(employee1, employee2);
		//Assert
		int EXPECTED_COMPARE_RESULT = -1;
		assertEquals(EXPECTED_COMPARE_RESULT, salaryComparator);
		
	}
	@Test
	public void comparatorSalary_WHEN_comparingTwoEmployeeSalary_THEN_returnOne() {
		//Act
		Employee employee1 = new Employee(ANY_NAME, 8000);
		Employee employee2 = new Employee(ANY_NAME, 5000);
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Salary);
		int salaryComparator = compType.compare(employee1, employee2);
		//Assert
		int EXPECTED_COMPARE_RESULT = 1;
		assertEquals(EXPECTED_COMPARE_RESULT, salaryComparator);
	}
	@Test
	public void comparatorSalary_WHEN_comparingTwoEmployeeSalary_THEN_returnZero() {
		//Act
		Employee employee1 = new Employee(ANY_NAME, 5000);
		Employee employee2 = new Employee(ANY_NAME, 5000);
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Salary);
		int salaryComparator = compType.compare(employee1, employee2);
		//Assert
		int EXPECTED_COMPARE_RESULT = 0;
		assertEquals(EXPECTED_COMPARE_RESULT, salaryComparator);
	}
	
	//Compare Number
	@Test
	public void comparatorNumber_WHEN_comparingTwoEmployeeNumber_THEN_returnMinusOne() {
		//Act
		Employee firstEmployee = new Employee(ANY_NAME, INITIAL_ANNUAL_SALARY);
		Employee SecondEmployee = new Employee(ANY_NAME, INITIAL_ANNUAL_SALARY);
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Number);
		int numberComparator = compType.compare(firstEmployee, SecondEmployee);
		//Assert
		int EXPECTED_COMPARE_RESULT = -1;
		assertEquals(EXPECTED_COMPARE_RESULT, numberComparator);
		
	}
	@Test
	public void comparatorName_WHEN_comparingTwoEmployeeNumber_THEN_returnOne() {
		//Act
		Employee firstEmployee = new Employee(ANY_NAME, INITIAL_ANNUAL_SALARY);
		Employee SecondEmployee = new Employee(ANY_NAME, INITIAL_ANNUAL_SALARY);
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Number);
		int numberComparator = compType.compare(SecondEmployee, firstEmployee);
		//Assert
		int EXPECTED_COMPARE_RESULT = 1;
		assertEquals(EXPECTED_COMPARE_RESULT, numberComparator);
	}
	@Test
	public void comparatorName_WHEN_comparingTwoEmployeeNumber_THEN_returnZero() {
		//Act
		Employee firstEmployee = new Employee(ANY_NAME, INITIAL_ANNUAL_SALARY);
		Employee SecondEmployee = firstEmployee;
		Comparator<Employee> compType = comparatorFabric.create(ComparatorType.Number);
		int numberComparator = compType.compare(firstEmployee, SecondEmployee);
		//Assert
		int EXPECTED_COMPARE_RESULT = 0;
		assertEquals(EXPECTED_COMPARE_RESULT, numberComparator);
	}
	
	
}
