package com.homework.workpeople;

import com.homework.additional.IllnessType;
import com.homework.additional.WorkerCategory;

//public class Human {
public class Human {

	private String firstName;
	private String middleName;
	private String lastName;
	private int birthYear;
	private boolean isHealthy=true;
	private IllnessType diagnosis;
	private int salary; 
	private WorkerCategory category;

	//Geters/Seters
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
	
	public String getMainInfo(int currentYear)
	{
		if(this.birthYear==0)return getFullName();
		return getFullName()+" age "+getAge(currentYear);
	}
	
	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}
	
	public void setHealthy(boolean isHealthy, IllnessType diagnosis) {
		this.isHealthy = isHealthy;
		this.diagnosis = diagnosis;
	}

	public String getHealthInfo()
	{
		if(this.diagnosis==null) this.diagnosis=IllnessType.HELTHY;
		if(this.isHealthy)return (this.firstName+" is " + this.diagnosis+". ");
		else return(this.firstName+" is ill: " + this.diagnosis+". ");
	}
	
	public WorkerCategory getCategory() {
		return category;
	}

	public void setCategory(WorkerCategory category) {
		this.category = category;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

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
	
	//procedure
	public String toString() {
		return "Hello, I'm Ivanov!";
	}
	
	public void phraseOnTheWay()
	{
		System.out.println("Good weather!");
	}

	//{{Конструмкторы
 	public Human()
 	{
 		salary=2000;
 		isHealthy=true;
 		category=WorkerCategory.LOWER;
 	}
 	
 	public Human(int salary, boolean isHealthy, WorkerCategory category, IllnessType diagnosis)
 	{
 		this.salary=salary;
 		this.isHealthy=isHealthy;
 		this.category=category;
 		this.diagnosis=diagnosis;
 	}
 	
 	public Human(int salary, boolean isHealthy, WorkerCategory category)
 	{
 		this.salary=salary;
 		this.isHealthy=isHealthy;
 		this.category=category;
 	}
	//}}
}
