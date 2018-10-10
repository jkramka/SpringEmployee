package beans;

public class EmployeeServiceImpl implements EmployeeService{

	private	EmployeeDao	employeeDao;
	
	public	EmployeeDao	getEmployeeDao()	{
		return	employeeDao;
	}
	
	public	void	setEmployeeDao(EmployeeDao	employeeDao)	{
		this.employeeDao = employeeDao;
	}
	
	public void changeYearlySalary(long	sourceEmployeeId, double raise)	{
		Employee sourceEmployee	= employeeDao.find(sourceEmployeeId);
		
		sourceEmployee.setSalary((sourceEmployee.getSalary() * raise) + sourceEmployee.getSalary());
		
		employeeDao.update(sourceEmployee);
		
	}
	
	public	void	totalRaise(long	employeeId,	double	raise)	{
		Employee employee = employeeDao.find(employeeId);
		employee.setPayIncrease(employee.getSalary() * raise);
		employeeDao.update(employee);
	}
	
	public	Employee	getEmployee(long	employeeId)	{
		return	employeeDao.find(employeeId);
	}
	
}
