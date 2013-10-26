package com.homework.workpeople;

//public class Human {
public abstract class Human {

	private String firstName;
	private String middleName;
	private String lastName;
	private int birthYear;
	private boolean isHealthy=true;
	private String diagnosis;
	private int salary; 
	private String category;

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getFullName()
	{
		if(this.middleName==null) this.middleName="";
		String names=firstName+" "+middleName+" "+lastName;
		names = names.replace("  ", " ");
		return names; 
	}
	
	public int getAge(int currentYear)
	{
		return currentYear-birthYear;
	}
	
	public String getInfo(int currentYear)
	{
		if(this.birthYear==0)return getFullName();
		return getFullName()+" age "+getAge(currentYear);
	}
	
	public void setMainInfo(String firstName, String lastName) 
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void setMainInfo(String firstName, String middleName, String lastName) 
	{
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
	}
	
	public void setMainInfo(String firstName, String middleName, String lastName, int birthYear) 
	{
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;
		this.birthYear=birthYear;
	}
	
	//Любимая фраза по пути на работу
	public void phraseOnTheWay()
	{
		System.out.println("Good weather!");
	}
 	//Конструктор для набора срднего специалиста
 	public Human()
 	{
 		salary=2000;
 		isHealthy=true;
 		category="lower";
 		diagnosis=".";
 		isHealthy=true;
 	}

}
