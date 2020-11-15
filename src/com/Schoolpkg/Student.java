package com.Schoolpkg;

public class Student {
	
	
	/* Student dependencies */
	
	protected String Student_First_Name; 
	protected String Student_Family_name;
	protected String Student_Id;

	
	/* Default Constructor */ 
	
	public Student() {
	super();
	System.out.println("First condt Student class ");
	}
	
 
	/* constructor */
	
	public Student(String Student_First_Name,String Student_Family_name,String Student_Id) {
		this.Student_First_Name = Student_First_Name;
		this.Student_Family_name= Student_Family_name;
		this.Student_Id = Student_Id;
		
	}

	/* STUDENT FIRST NAME [GETTER/SETTER] */
	
	public String getStudent_First_Name() {
		return Student_First_Name;
	}


	public void setStudent_First_Name(String student_First_Name) {
		this.Student_First_Name = student_First_Name;
	}

	/* STUDENT FAMILY NAME [GETTER/SETTER] */
	
	public String getStudent_Family_name() {
		return Student_Family_name;
	}


	public void setStudent_Family_name(String student_Family_name) {
		this.Student_Family_name = student_Family_name;
	}

	/* STUDENT FIRST ID  [GETTER/SETTER] */
	
	public String getStudent_Id() {
		return Student_Id;
	}


	public void setStudent_Id(String student_Id) {
		this.Student_Id = student_Id;
	}
	
	/* *********** DISPLAY ***************** */
	
	void display() {
	System.out.println("STUDENT ID :"+Student_Id+"\n"+"STUDENT FAMILY NAME : "+Student_Family_name+"\n"+"STUDENT FIRST NAME :"+Student_First_Name);
		
	}

}
