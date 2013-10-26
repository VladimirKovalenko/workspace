
public class Main_4 {

public static int method=2;
	
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
			default:
				System.out.println("Invalid numbre of test");
		}
	}
	
	/*Создать программу, проверяющую и сообщающую на экран, является ли целое 
	 * число записанное в переменную n, чётным либо нечётным.*/
	public static void test0()
	{
		int n=0;
		if(n%2!=0)System.out.println("Number is even");
		else System.out.println("Number is odd");
	}

	/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел, 
	 * записанных в переменные m и n. Например, среди чисел 8,5 
	 * и 11,45 ближайшее к десяти 11,45.*/
	public static void test1()
	{
		int m=-8, n=-12;
		if(Math.abs(m-10)==Math.abs(n-10)) System.out.println("Numbers are equel");
		else if(Math.abs(m-10)<Math.abs(n-10)) System.out.println("m closer to ten");
		else System.out.println("n closer to ten");
	}

	/*В три переменные a, b и c записаны три вещественных числа. 
	 * Создать программу, которая будет находить и выводить на экран 
	 * вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.*/
	public static void test2()
	{
		int a=2,b=8,c=7;
		double discr, first, second;
		discr=Math.pow(b, 2)-4*a*c;
		if(discr>0)
		{
			first=(-b+Math.sqrt(discr))/a*2;
			second=(-b-Math.sqrt(discr))/a*2;
			System.out.println("Equation have 2 root: \n first= "+first+"\n second= "+second);
		}
		else if(discr==0)
		{
			first=-b/a*2;
			System.out.println("Equation have 1 root: \n first= "+first);
		}
		else if(discr<0) System.out.println("Equation have not root.");
		else System.out.println("Somthing wrong");
	}
}

