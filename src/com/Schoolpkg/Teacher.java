package com.Schoolpkg;
import java.util.ArrayList;
public class Teacher extends Classe {
	
	/* ---------------- attributes ------------------- */
	
	protected String  Teacher_First_Name ;
	protected String  Teacher_Family_Name;
	protected String  Teacher_Id;
	protected ArrayList <Classe> Classe_Tab  ;
	
	
	/* ---------- DEFAUT CONSTRUCTOR 	*************** */
	
	public Teacher() {
		super();
		System.out.println("default constructor for Teacher class");
	}
	
	
	/* ----------- CONSTRUCTOR ------------------------ */
	
	public Teacher ( String Teacher_First_Name, String Teacher_Family_Name, String Teacher_Id,ArrayList<Classe> Classe_Tab ) {
		
	this.Teacher_Family_Name = Teacher_Family_Name ;
	this.Teacher_First_Name  = Teacher_First_Name  ;
	this.Teacher_Id 		 = Teacher_Id;
	this.Classe_Tab = Classe_Tab;
		
	}
	
	/* ------------ SETTERS  ------------------------- */
	
	public void setTeacher_First_Name (String Teacher_First_Name ) {
	
	this.Teacher_First_Name = Teacher_First_Name;
	 
	}
	
	public void setTeacher_Family_Name (String Teacher_Family_Name ) {
		
		this.Teacher_First_Name = Teacher_Family_Name;
		 
		}
	
	public void setTeacher_Id (String Teacher_Id ) {
		
		this.Teacher_Id = Teacher_Id;
		 
		}
	
	/* --------------- GETTERS -------------------- */
	
	public String getTeacher_First_Name () {
		return Teacher_First_Name;
	}
	
	public String getTeacher_Family_Name () {
		return Teacher_Family_Name;
	}

	public String getTeacher_Id() {
		return Teacher_Id;
	}
	
	/* --------------- DISPLAY ------------------- */
	
	void display() {
		System.out.println("TEACHER ID :"+Teacher_Id+"\n"+"TEACHER FAMILY NAME : "+Teacher_Family_Name+"\n"+"TEACHER FIRST NAME :"+Teacher_First_Name+"\n"+" the Classe id :"+Classe_Tab.get(0));		
		}
	
}
;