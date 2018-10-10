package beans;

import	java.util.ArrayList;
import	java.util.HashMap;
import	java.util.List;
import	java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDao{
	
	private	Map<Long,	Employee>	employeesMap	=	new	HashMap<Long,	Employee>();
	{
	Employee	employee1	=	new	Employee(1L,	"John Smith",	10000.00);
	Employee	employee2	=	new	Employee(2L,	"Mary Hammond",	20000.00);
	employeesMap.put(employee1.getId(),	employee1);
	employeesMap.put(employee2.getId(),	employee2);
	}
	
	public	void	insert(Employee	employee)	{
		employeesMap.put(employee.getId(),	employee);
	}
	
	public	void	update(Employee	employee)	{
		employeesMap.put(employee.getId(),	employee);
	}
	public	void	update(List<Employee>	employees)	{
		for(Employee	employee:	employees){
			update(employee);
		}
	}
	
	public	void	delete(long	employeeId)	{
		employeesMap.remove(employeeId);
	}
			
	public	Employee	find(long	employeeId)	{
		return	employeesMap.get(employeeId);
	}
	
	public	List<Employee>	find(List<Long>	employeeIds)	{
		List<Employee>	employees	=	new	ArrayList<Employee>();
		for(Long	id:	employeeIds){
		employees.add(employeesMap.get(id));
		}
		return	employees;
	}
	
	public	List<Employee>	find(String	ownerName)	{
		List<Employee>	employees	=	new	ArrayList<Employee>();
		for(Employee	employee:	employeesMap.values()){
			if(ownerName.equals(employee.getEmployeeName())){
				employees.add(employee);
			}
		}
		return	employees;
	}
	
	public	List<Employee>	find(boolean	locked)	{
		List<Employee>	employees	=	new	ArrayList<Employee>();
		for(Employee	employee:	employeesMap.values()){
			if(locked	==	(employee.isLocked())){
			employees.add(employee);
			}
		}
		return	employees;
	}
}
