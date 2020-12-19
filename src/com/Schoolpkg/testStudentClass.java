package com.Schoolpkg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudentClass {

	public static void main(String[] args) {
		
		
	/* TESTING THE STUDENT CLASS BEAN */
		
	ApplicationContext conx = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	//Student Student1 = (Student) conx.getBean("Student1");
	//Student1.display();
	
	/*Student Student2 = (Student) conx.getBean("Student1");
	Stduent2.*/
	
	//((ClassPathXmlApplicationContext) conx).close();	
	

	
	/* TESTING THE TEACHER CLASS BEAN */
		
	Teacher Teacher1 = (Teacher) conx.getBean("Teacher");
	Teacher1.display();
	
	
	
	/* TESTING THE TEACHER CLASS BEAN */
	
	//School_Subject subject1 = (School_Subject) conx.getBean("Subject");
	//subject1.display();
	
	
	/* CLOSING THE APPLICATION_CONTEXT FILE  */ 
	
	((ClassPathXmlApplicationContext) conx).close();	
	
	

	}

}
