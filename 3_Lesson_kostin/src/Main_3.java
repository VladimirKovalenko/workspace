
public class Main_3 {

public static int method=6;
	
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
			case 4:
				test4();
				break;
			case 5:
				test5();
				break;
			case 6:
				test6();
				break;
			default:
				System.out.println("Invalid numbre of test");
		}
	}
	
	/*Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов 
	 * без использования функции Math.toDegrees(n).*/
	public static void test0()
	{
		System.out.println(Math.cos(Math.PI/(180/60)));
		System.out.println(Math.cos(Math.PI/(180/45)));
		System.out.println(Math.cos(Math.PI/(180d/40d)));
	}

	/*В переменных a и b лежат положительные длины катетов прямоугольного 
	 * треугольника. Вычислить и вывести на экран площадь треугольника и его периметр.*/
	public static void test1()
	{
		int a=3, b=4;
		double s,p;
		s=a*b/2;
		p=a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println(s+"  "+p);
	}

	/*Натуральное положительное число записано в переменную n. 
	 * Определить и вывести на экран, сколько цифр в числе n.*/
	public static void test2()
	{
		int var=11001,count=0;
		while(var>=1)
		{
			count++;
			var=var/10;
		}
		System.out.println(count);
	}

	/*В переменной n лежит некоторое вещественное число. 
	 * Вычислить и вывести на экран значение функции «сигнум» от 
	 * этого числа (-1, если число отрицательное; 0, если нулевое; 1 если, положительное).*/
	public static void test3()
	{
		int var=0;
		if(var==0)System.out.println(0);
		else if (var<0)System.out.println(-1);
		else if (var>0)System.out.println(1);
		else System.out.println("0_o");
	}

	/*Создайте программу, которая будет генерировать и выводить 
	 * на экран вещественное псевдослучайное число из промежутка [-3;3).*/
	public static void test4()
	{
		System.out.println(Math.random()*6-3);
	}
	
	/*Натуральное положительное число записано в переменную n. 
	 * Создайте программу, которая будет генерировать и выводить на 
	 * экран целое псевдослучайное число из отрезка [-n;n].*/
	public static void test5()
	{
		int var=67;
		for(int i=0;i<100000;i++)
		{	
			double temp=Math.random()*var*2-var;
			if(temp>=65) System.out.print(Math.round(temp)+"+");
		}
	}
	
	/*В переменные a и b записаны целые числа, при этом b больше a. 
	 * Создайте программу, которая будет генерировать и выводить на 
	 * экран целое псевдослучайное число из отрезка [a;b].*/
	public static void test6()
	{
		int a=4,b=5;
		for(int i=0;i<100000;i++)
		{	
			double temp=a + Math.random()*(b-a);
//			if(temp<=-3 || temp>2) 
				System.out.println(temp);
		}
	}
}