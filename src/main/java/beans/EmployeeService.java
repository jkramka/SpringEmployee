package beans;

public interface EmployeeService {
	public	void	changeYearlySalary(long	sourceEmployeeId, double	raise);
	public	void	totalRaise(long	employeeId,	double	raise);
	public	Employee	getEmployee(long	employeeId);
}
