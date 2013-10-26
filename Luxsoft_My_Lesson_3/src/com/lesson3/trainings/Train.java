package com.lesson3.trainings;

public abstract class Train {
	public int len;
	public int countOfWagons;
	public int typeOfWagon;
	
	public void slowDown()
	{
		System.out.println("We're slowing down");
	}
	
	abstract public int getCountOfWagons();
	
	
	public abstract void consumePower();
	
}
