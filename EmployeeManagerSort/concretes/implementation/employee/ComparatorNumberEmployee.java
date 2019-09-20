package implementation.employee;

import java.util.Comparator;

public class ComparatorNumberEmployee  implements Comparator<Employee> {

	//@Override
	public int compare(Employee employee1, Employee employee2) {
		
		float employee1Number = employee1.getNumber();
		float employee2Number = employee2.getNumber(); 

		if (employee1Number < employee2Number) {  
			return -1;
		}
		else if (employee1Number > employee2Number) {
			return 1;
		}
		else {  
			return 0;
		} 
	}
}
