package implementation.employee;

import java.util.Comparator;

import abstracts.employee.IEmployee;

public class ComparatorNameEmployee implements Comparator<Employee> {

	/*//@Override
	public int compare(IEmployee employee1, IEmployee employee2) {
		
		String employee1Name = employee1.getName();
		String employee2Name = employee2.getName();
		int compareName = employee1Name.compareTo(employee2Name);  

		if (compareName < 0) {  
			return -1;
		}
		else if (compareName > 0) {
			return 1;
		}
		else {  
			return 0;
		} 
	}*/

	@Override
	public int compare(Employee employee1, Employee employee2) {
		String employee1Name = employee1.getName();
		String employee2Name = employee2.getName();
		int compareName = employee1Name.compareTo(employee2Name);  

		if (compareName < 0) {  
			return -1;
		}
		else if (compareName > 0) {
			return 1;
		}
		else {  
			return 0;
		} 
	}

}
