
public class Main {

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
	
	/*В переменных q и w хранятся два натуральных числа. Создайте программу, 
	 * выводящую на экран результат деления q на w с остатком. Пример вывода 
	 * программы (для случая, когда в q хранится 21, а в w хранится 8):
	21 / 8 = 2 и 5 в остатке*/
	public static void test0()
	{
		int q=17, w=3;
		System.out.println(q+"/"+w+"="+q/w+" и "+q%w+" в остатке");
	}

	/*В переменной n хранится натуральное двузначное число. 
	 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
	public static void test1()
	{
		int var=655, sum=0;
		while(var>=1)
		{
			sum=sum+var%10;
			var=var/10;
		}
		System.out.println(sum);
	}

	/*В переменной n хранится вещественное число с ненулевой дробной частью. 
	 * Создайте программу, округляющую число n до ближайшего целого и 
	 * выводящую результат на экран.*/
	public static void test2()
	{
		double var=5.6;
		System.out.println(Math.round(var));
		if(var%1>=0.5)System.out.println((int)var+1);
		else System.out.println((int)var);
	}

	/*В переменной n хранится натуральное трёхзначное число. 
	 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/
	public static void test3()
	{
		test1();
	}
}
