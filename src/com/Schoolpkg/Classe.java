package com.Schoolpkg;

public class Classe {

	
	/*  Attributes */
	
	protected String Classe_Id;
	protected String Classe_Name;
	
	public Classe() {
		super();
	}
	
	/*  CONSTRUCTOR */
	
	public Classe (String Classe_Id, String Classe_Name) {
		
		this.Classe_Id = Classe_Id;
		this.Classe_Name  = Classe_Name;	
	}
	
	
	/* GETTERS / SETTERS */

	public String getClasse_Id() {
		return Classe_Id;
	}

	public void setClasse_Id(String classe_Id) {
		Classe_Id = classe_Id;
	}

	public String getClasse_Name() {
		return Classe_Name;
	}

	public void setClasse_Name(String classe_Name) {
		Classe_Name = classe_Name;
	}
	
	/* display method */ 
	
	
	/* *********** DISPLAY ***************** */
	
	void display() {
	System.out.println("CLASSE ID :"+Classe_Id+"\n"+"CLASSE NAME : "+Classe_Name);

	}
}