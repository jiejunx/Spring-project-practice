package companyInfo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Client {
	public static void main(String[] args) {
		
		// Object construction
		
		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("SunnyXie");
		eRef.setAddress("Smithe Street");
		
		System.out.println("Employee Details: " + eRef);
		
		// Spring way | IOC(Inversion of Control)
//		Resource resource = new ClassPathResource("empoyeebeans.xml");
//		// deprecated 
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		Employee e1 = (Employee)factory.getBean("emp1");
//		Employee e2 = factory.getBean("emp2", Employee.class);
//		
//		System.out.println("Employee details " + e1);
//		
//		System.out.println("Employee details " + e2);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeBeans.xml");

		Employee e1 = (Employee)context.getBean("emp");
		System.out.println("Employee1 Details" + e1);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)(context);
		
		cxt.close();
		
	}
	

}
