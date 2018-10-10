package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext	applicationContext	=	new	AnnotationConfigApplicationContext(BeanConfiguration.class);
		//ClassPathXmlApplicationContext	applicationContext	=	new	ClassPathXmlApplicationContext("beans/beans.xml");
		
		EmployeeService	employeeService	=	applicationContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println("Before	raise is applied to yearly salary.");
		System.out.println("Employee	1	Salary:	"	+employeeService.getEmployee(1).getSalary());
		System.out.println("Employee	2	Salary:	"	+employeeService.getEmployee(2).getSalary());
		
		//runs by setting the raise to 3 percent.
		employeeService.totalRaise(1, 0.030);
		employeeService.totalRaise(2, 0.030);
		employeeService.changeYearlySalary(1, 0.030);
		employeeService.changeYearlySalary(2, 0.030);
		
			
		System.out.println("After the raise is applied to the yearly salary.");
		System.out.println("Employee	1	salary increased by :" + employeeService.getEmployee(1).getPayIncrease() + " to a new yearly salary of :" +employeeService.getEmployee(1).getSalary());
		System.out.println("Employee	1	salary increased by :" + employeeService.getEmployee(2).getPayIncrease() + " to a new yearly salary of :" +employeeService.getEmployee(2).getSalary());
	}

}
