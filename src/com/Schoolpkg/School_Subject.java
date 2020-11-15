package com.Schoolpkg;

public class School_Subject {

	protected String Subject_Name ;
	protected String Subject_Id;
	
	
	/* ---------- Default constructor --------*/
	
	public	School_Subject () {
		super();
	}
	
	/* ---------- CONSTRUCTOR --------------- */
	
	public School_Subject (String Subject_Name , String Subject_Id) {
		
		this.setSubject_Id(Subject_Id) ;
		this.setSubject_Name(Subject_Name);
		
		
	}

	public String getSubject_Name() {
		return Subject_Name;
	}

	public void setSubject_Name(String subject_Name) {
		Subject_Name = subject_Name;
	}

	public String getSubject_Id() {
		return Subject_Id;
	}

	public void setSubject_Id(String subject_Id) {
		Subject_Id = subject_Id;
	}
	
	
	/* *********** DISPLAY ***************** */
	
	void display() {
	System.out.println("SUBJECT ID :"+Subject_Id+"\n"+"SUBJECT NAME : "+Subject_Name);
		
	}

}
 