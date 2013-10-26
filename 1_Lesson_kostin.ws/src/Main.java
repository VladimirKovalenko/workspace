public class Main {

	public static void main(String[] args) 
	{
//		hello();
//		task1();
//		task2();
//		task3();
//		task4();
		task5();
	}
	private static void hello()
	{
		System.out.printf("Hello %n%s!", "World");
	}
	
	private static void task1()
	{
		double finelResult=20.0*1/3+Math.pow(158, 2);
		System.out.printf("%n%.4f",finelResult);
//		System.out.println();
	}
	
	private static void task2()
	{
//		14/209+14(29-13+14/3)
		double forteen=14;
		System.out.printf("%n%2.4f", forteen/209+Math.pow(forteen, (29-Math.pow(13, 2)+14/3)));
	}
	/*В переменной n хранится двузначное число. Создайте программу, 
	 * вычисляющую и выводящую на экран сумму цифр n.*/
	private static void task3()
	{
		int number = 1234, summery=0;
		while(number>=1)
		{
			summery=summery+number%10;
			number=number/10;
		}
		System.out.println(summery);
	}
	
	/*В переменной n хранится вещественное число с ненулевой дробной частью. 
	 * Создайте программу, округляющую число n до ближайшего целого и 
	 * выводящую результат на экран.*/
	private static void task4()
	{
		double number=5.5;
		System.out.print(Math.round(number));
	}
	
/*В переменной n хранится трёхзначное число. Создайте 
 * программу, вычисляющую и выводящую на экран сумму цифр n.*/
	private static void task5()
	{
		task3();
	}
}
