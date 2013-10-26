package com.lesson3.trainings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class TestTrain {
	
	@Test
	public void testCountOfWagons()
	{
		int expectedCountOfWagons =20;
		Train electricTrain=new ElectricTrain(20);
		Assert.assertEquals(electricTrain.getCountOfWagons(), expectedCountOfWagons);
	}
	
	@Test
	public void secondTest()
	{
		String foo ="foo";
		String bar = "foo";
//		Assert.assertTrue(foo == bar);
		
		ElectricTrain t1= new ElectricTrain(25);
		ElectricTrain t2=new ElectricTrain(25);
		
		if(t1==t2)
		{
			System.out.println("Y");
		}
		else 
		{
			System.out.println("N");
		}
		
		if(foo.equals(bar))
		{
			System.out.println(foo=bar);
		}
		Assert.assertTrue(foo==bar);
	}
	
	@Test
	public void arrayAndCollection()
	{
		String[] strArr = {"cat", "dog", "human"};
		for(int i=0; i<strArr.length; i++)
		{
			System.out.println(strArr[i]);
		}
		
		List<String> list=new ArrayList<String>();
		
		list.add("cat in list");
		list.add("dog in list");
		
		for(String animal : list)
		{
			System.out.println(animal);
		}
		
//		Iterator<String> it = list.iterator();
//		while (it.hasNext())
//		{
//			System.out.println(it+" iterator");
//		}
		
		System.out.println(list.get(1)+" get");
		
		List secondOne=Arrays.asList(strArr);
		
		for(Object entity : secondOne)
		{
			System.out.println("sdf111");
		}
	}
}
