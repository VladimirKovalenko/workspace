import java.util.Scanner;
public class Main_6 {

public static int method=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch (method) 
		{
			
			case -1:
				example0();
				break;
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

	public static void example0()
	{
		Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
          System.out.println(i*2);
        } else {
          System.out.println("Вы ввели не целое число");
        }
	}

	/*Создать программу, которая будет сообщать, является ли целое число, 
	 * введённое пользователем, чётным или нечётным. Если пользователь введёт 
	 * не целое число, то сообщать ему об ошибке.*/
	public static void test0()
	{
		Scanner str=new Scanner(System.in);
		System.out.println("Please, write in number");
		if(str.hasNextInt()) 
		{
			if(str.nextInt()%2!=0)System.out.println("Number is even");
			else System.out.println("Number is odd");
		}
		else System.out.println("error");
	}

	/*Создать программу, которая будет вычислять и выводить на экран 
	 * сумму двух целых чисел, введённых пользователем. Если пользователь 
	 * некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.*/
	public static void test1()
	{
		int a=0,b=0;
		Scanner str=new Scanner(System.in);
		System.out.println("first");
		if(str.hasNextInt()) a=str.nextInt();
		else System.out.println("error");
		System.out.println("second");
		if(str.hasNextInt()) b=str.nextInt();
		else System.out.println("error");
		System.out.println("res "+(a+b));
	}

	/*Создать программу, которая будет выводить на экран меньшее по модулю 
	 * из трёх введённых пользователем вещественных чисел.*/
	public static void test2()
	{
		int number=3;
		int[] vars={0,0,0};
		Scanner str=new Scanner(System.in);
		String[] numOfArg={"first","second","third"};
		for(int i=0; i<number; i++)
		{
			System.out.println(numOfArg[i]);
			if(str.hasNextInt()) vars[i]=Math.abs(str.nextInt());
			else System.out.println("error");
		}
		System.out.println(Math.min(Math.min(vars[0], vars[1]), vars[2]));
	}

	/*Создать программу, которая будет проверять, является ли слово из 
	 * пяти букв, введённое пользователем, палиндромом (примеры: «комок», «ротор»). 
	 * Если введено слово не из 5 букв, то сообщать об ошибке. Программа 
	 * должна нормально обрабатывать слово, даже если в нём использованы 
	 * символы разного регистра. Например, слова «Комок» или «РОТОР» следует 
	 * также считать палиндромами.*/
	public static void test3()
	{
		Scanner str=new Scanner(System.in);
		System.out.println("write word");
		String s=str.nextLine();
		if(s.length()!=5) System.out.println("error");
		s=s.toLowerCase();
		if(s.charAt(0)==s.charAt(s.length()-1) && s.charAt(1)==s.charAt(s.length()-2))
				System.out.println("polindrom");
		else System.out.println("not polindorm");
	}
}

