
public class Main_5 {

public static int method=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch (method) 
		{ 
			case 0:
				test0();
				break; 
			case 1: 
				test1();
				break; 
			case 2:
				test2();
				break;
			case 3:
				test3();
				break;
			default:
				System.out.println("Invalid numbre of test");
		}
	}

	/*Создать программу, которая будет проверять попало ли случайно 
	 * выбранное из отрезка [5;155] целое число в интервал (25;100) 
	 * и сообщать результат на экран.
	Примеры работы программы:
	
	Число 113 не содержится в интервале (25,100)
	Число 72 содержится в интервале (25,100)
	Число 25 не содержится в интервале (25,100)
	Число 155 не содержится в интервале (25,100)*/
	public static void test0()
	{
		int randNumber=(int)Math.round((Math.random()*150+5));
		if(randNumber>25 && randNumber<100) System.out.println("Число "+randNumber+" содержится в интервале (25,100)");
		else System.out.println("Число "+randNumber+" не содержится в интервале (25,100)");
	}

	/*Создать программу, выводящую на экран случайно сгенерированное 
	 * трёхзначное натуральное число и его наибольшую цифру.
	Примеры работы программы:
	
	В числе 208 наибольшая цифра 8
	В числе 774 наибольшая цифра 7
	В числе 613 наибольшая цифра 6*/
	public static void test1()
	{
		int randNumber=0;
		while(randNumber<99)
		{
			randNumber=(int)Math.round((Math.random()*1000));
		}
		int a,b,c;
		a=randNumber%10;
		b=((int)(randNumber/10))%10;
		c=((int)(randNumber/100))%10;
		System.out.println("В число "+randNumber+" наибольшая цифра "+Math.max(Math.max(a, b), c));
	}

	/*В три переменные a, b и c явно записаны программистом три целых 
	 * попарно неравных между собой числа. Создать программу, 
	 * которая переставит числа в переменных таким образом, чтобы при 
	 * выводе на экран последовательность a, b и c оказалась строго возрастающей.

	Числа в переменных a, b и c: 3, 9, -1
	Возрастающая последовательность: -1, 3, 9
	Числа в переменных a, b и c: 2, 4, 3
	Возрастающая последовательность: 2, 3, 4
	Числа в переменных a, b и c: 7, 0, -5
	Возрастающая последовательность: -5, 0, 7*/
	public static void test2()
	{
		int a=12, b=-34, c=56;
		int max,min,mid;
		max=Math.max(Math.max(a, b), c);
		min=Math.min(Math.min(a, b), c);
		if(a!=min && a!=max) mid=a;
		else if(b!=min && b!=max) mid=b;
		else mid=c;
		System.out.println("Числа в переменных a, b и c: "+a+", "+b+", "+a+" "
				+ "/n Возрастающая последовательность: "+min+", "+mid+", "+max);
	}

	/*На некотором предприятии инженер Петров создал устройство, на табло которого 
	показывается количество секунд, оставшихся до конца рабочего дня. Когда рабочий 
	день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов), 
	когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда 
	наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
	Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток 
	рабочего дня в секундах. Иванов вызвался помочь сотрудницам и написать программу, которая 
	вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных 
	часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», 
	«остался 1 час», «осталось менее часа».	Итак, в переменную n должно записываться 
	случайное (на время тестирования программы) целое число из [0;28800], далее оно 
	должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна 
	выводиться фраза о количестве полных часов, содержащихся в n секундах.
	Примеры работы программы:
	23466
	Осталось 6 часов
	10644
	Осталось 2 часа
	5891
	Остался 1 час
	1249
	Осталось менее часа*/
	public static void test3()
	{
		int randomTime, hour;
		randomTime=(int)Math.round(Math.random()*28800);
		hour=randomTime/(60*60);
		//from 4 to 8
		if(randomTime>=14400) System.out.println(randomTime+"\nОсталось "+hour+" часов");
		//от 2 до 4
		if(randomTime>=7200 && randomTime<14400) System.out.println(randomTime+"\nОсталось "+hour+" часа");
		if(randomTime>=3600 && randomTime<7200) System.out.println(randomTime+"\nОстался "+hour+" час");
		else if(randomTime<3600) System.out.println(randomTime+"\nОсталось менее часа");
	}
}

