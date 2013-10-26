package com.homework.factory;

import com.homework.workpeople.Ivanov;


public class Factory {

	//Мнимый отдел кадров на заводе, где сотрудники проходят регистрацию(перерегистрацию).
	public static void main (String [] args)
	{
		//Входит 3 рабочих в отдел кадров...
		com.homework.workpeople.Ivanov ivanov=new com.homework.workpeople.Ivanov();
		com.homework.workpeople.Petrovich petrov=new com.homework.workpeople.Petrovich();
		com.homework.candidates.Sidorov sidorov=new com.homework.candidates.Sidorov();

		 ivanov.setHealthy(false, "");
		 System.out.println(ivanov.healthInfo());
		 
		//...и здороваются.
		System.out.println(ivanov+"\n"+petrov+"\n"+sidorov);
		
		//Потом их просят представится более детально для проверки.
		ivanov.setMainInfo("Иван", "Иванович", "Иванов", 1951);
		petrov.setMainInfo("Михаил", "Петрович", "Дергачёв", 1968);
		sidorov.setMainInfo("Ваня", "Сидоров");
		sidorov.setBirthYear(1989);
		
		ivanov.setHealthy(true,"");
		System.out.println(ivanov.healthInfo());
		
		//После запроса выдаётся анкета работника.
		System.out.println(	"\n1 person is "+ivanov.getInfo(2013)+
							"\n  salary = "+ivanov.getSalary()+" USD"+
							"\n  woring category = "+ivanov.getCategory()+
							"\n  healthstatus = "+ivanov.healthInfo());
		
		System.out.println(	"\n1 person is "+petrov.getInfo(2013)+
							"\n  salary = "+petrov.getSalary()+" USD"+
							"\n  woring category = "+petrov.getCategory()+
							"\n  healthstatus = "+petrov.healthInfo());
		
		System.out.println(	"\n1 person is "+sidorov.getInfo(2013)+
							"\n  salary = "+sidorov.getSalary()+" USD"+
							"\n  woring category = "+sidorov.getCategory()+
							"\n  healthstatus = "+sidorov.healthInfo());

	}

}
