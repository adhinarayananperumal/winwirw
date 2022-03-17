package sretw.sh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SHClient {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
		context = new ClassPathXmlApplicationContext("sretw/sh/springhib.xml");
		EmployeeDAO obj = (EmployeeDAO) context.getBean("employeeDAOImpl");
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setFirstName("ravi");

		obj.addEmployee(employeeEntity);
		
		//obj.addDepartment();
		
		}catch(Exception e) {
			e.printStackTrace();
			if(context!=null) {
				context=null;
			}
		}

	}

}
