package com.Schoolpkg;

public class Student {
	
	
	/* Student dependencies */
	
	private String Student_First_Name; 
	private String Student_Family_name;
	private String Student_Id;
	private Classe groupe;
	//private Teacher[] Liste_Teacher;

	
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

	/* constructor with inheritance */ 
	
	public Student(String student_First_Name, String student_Family_name, String student_Id, Classe groupe/*,
			Teacher[] liste_Teacher*/) {
		super();
		Student_First_Name = student_First_Name;
		Student_Family_name = student_Family_name;
		Student_Id = student_Id;
		this.setGroupe(groupe);
//		setListe_Teacher(liste_Teacher);
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
	System.out.println("STUDENT ID : "+Student_Id+"\n"+"STUDENT FAMILY NAME : "+Student_Family_name+"\n"+"STUDENT FIRST NAME  : "+Student_First_Name
			+"\n"+"groupe info : "+groupe.Classe_Id+"/"+groupe.Classe_Name);
		
	}


	/*GETTERS / SETTERS  for inherited object  groupe & liste_teacher */
	
	public Classe getGroupe() {
		return groupe;
	}


	public void setGroupe(Classe groupe) {
		this.groupe = groupe;
	}

	/*public Teacher[] getListe_Teacher() {
		return Liste_Teacher;
	}

	public void setListe_Teacher(Teacher[] liste_Teacher) {
		Liste_Teacher = liste_Teacher;
	}*/

}
