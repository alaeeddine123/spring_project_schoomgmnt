package com.Schoolpkg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudentClass {

	public static void main(String[] args) {
		
		
		
	ApplicationContext conx = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	Student Student1 = (Student) conx.getBean("Student");
	Student1.display();
	
	((ClassPathXmlApplicationContext) conx).close();	
	
	/* this is comment to test git */
	  
	
	

	}

}
