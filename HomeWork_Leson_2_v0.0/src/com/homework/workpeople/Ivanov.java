package com.homework.workpeople;


public class Ivanov extends Human {

	private int salary=4000;
	private String category="higher";
	private boolean isHealthy=false;
	private String diagnosis="- cold"; 
	
	//Здоров ли работник
	public String healthInfo()
	{
		if(this.diagnosis==null) this.diagnosis="";
		if(this.isHealthy)return ("Worker is helthy " + this.diagnosis+". ");
		else return("Worker is ill " + this.diagnosis+". ");
	}

	public void setHealthy(boolean isHealthy, String diagnosis) {
		this.isHealthy = isHealthy;
		this.diagnosis = diagnosis;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello, I'm Ivanov!";
	}
	
	public void phraseOnTheWay()
	{
		System.out.println("sfsdsf");
	}
}
