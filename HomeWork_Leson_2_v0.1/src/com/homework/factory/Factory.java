package com.homework.factory;

import com.homework.additional.IllnessType;
import com.homework.additional.WorkerCategory;

public class Factory {

	//Мнимый отдел кадров на заводе, где сотрудники проходят регистрацию(перерегистрацию).
	public static void main (String [] args)
	{
		//Входит 3 рабочих в отдел кадров...
		com.homework.workpeople.Human ivanov=new com.homework.workpeople.Human(2000, false, WorkerCategory.LOWER, IllnessType.TYPE7);
		com.homework.workpeople.Human petrov=new com.homework.workpeople.Human(3000, true, WorkerCategory.MEDIUM);
		com.homework.workpeople.Human sidorov=new com.homework.workpeople.Human(1000, true, WorkerCategory.PRELOWER);

		//...и здороваются.
//		System.out.println(ivanov+"\n"+petrov+"\n"+sidorov);
		
//		//Потом их просят представится более детально для проверки.
		ivanov.setMainInfo("Иван", "Иванович", "Иванов", 1951);
		petrov.setMainInfo("Михаил", "Петрович", "Дергачёв", 1968);
		sidorov.setMainInfo("Ваня", "Сидоров");
		sidorov.setBirthYear(1989);
		
		//После запроса выдаётся анкета работника.
		System.out.println(	"\n1 person is "+ivanov.getMainInfo(2013)+
							"\n  salary = \t\t"+ivanov.getSalary()+" USD"+
							"\n  woring category = \t"+ivanov.getCategory()+
							"\n  health status = \t"+ivanov.getHealthInfo());
		
		System.out.println(	"\n2 person is "+petrov.getMainInfo(2013)+
							"\n  salary = \t\t"+petrov.getSalary()+" USD"+
							"\n  woring category = \t"+petrov.getCategory()+
							"\n  health status = \t"+petrov.getHealthInfo());
		
		System.out.println(	"\n3 person is "+sidorov.getMainInfo(2013)+
							"\n  salary = \t\t"+sidorov.getSalary()+" USD"+
							"\n  woring category = \t"+sidorov.getCategory()+
							"\n  health status = \t"+sidorov.getHealthInfo());

	}

}
