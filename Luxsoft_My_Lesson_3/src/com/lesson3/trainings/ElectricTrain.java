package com.lesson3.trainings;

public class ElectricTrain extends Train {
 
	
	private int countOfWagons;
	
	public int getCountOfWagons() {
		return countOfWagons;
	}

	public void setCountOfWagons(int countOfWagons) {
		this.countOfWagons = countOfWagons;
	}

	@Override
	public void consumePower() 
	{
		System.out.println("implement");
	
	}
	
	public ElectricTrain(int countOfWagons)
	{
		this.setCountOfWagons(countOfWagons);
	}
	
	//constructor
	public ElectricTrain()
	{
		System.out.println("HI-HI");
	}
	
	public void formTrain(int countOfPassengers)
	{
		int countOfWagons=15;
		int countOfFreePlaces = countOfWagons=countOfPassengers;
	}
	
	public void formTrain(int countOfPassengers, int countOfWagons)
	{
		int countOfFreePlaces = countOfWagons=countOfPassengers;
	}
		
	public static void anyThing()
	{
		ElectricTrain electricTrain= new ElectricTrain();
	}
	//without main proj did not work
	public static void main(String[] arg)
	{
		ElectricTrain electricTrain= new ElectricTrain(20);
	}
	
//	public boolean equls(ElectricTrain electrictrain)
//	{
//		//ne dopisal
////		this.ele
//	}
}
