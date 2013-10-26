import java.util.Scanner;
public class Main_7 {

public static int method=16;
	
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
			case 4:
				test4();
				break;
			case 5:
				test5();
				break; 
			case 6: 
				test6();
				break; 
			case 7:
				test7();
				break;
			case 8:
				test8();
				break;
			case 9:
				test9();
				break;
			case 10:
				test10();
				break; 
			case 11: 
				test11();
				break; 
			case 12:
				test12();
				break;
			case 13:
				test13();
				break;
			case 14:
				test14();
				break;
			case 15:
				test15();
				break; 
			case 16: 
				test16();
				break; 
			default:
				System.out.println("Invalid numbre of test");
		}
	}

	public static void example0()
	{
		// prog — число созданное программой
        // user — число введённое пользователем
        int prog, user;
        // Генерируем случайное целое число от 1 до 10
        prog = (int)(Math.random() * 10) + 1;
        System.out.println("Я загадала число от 1 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);  
        // Проверяем, есть ли в потоке ввода целое число
        if( input.hasNextInt() ) {
            do {
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if(user == prog) {
                    System.out.println("Вы угадали!");
                } else {
                    // Проверяем, входит ли число в отрезок [1;10]
                    if (user > 0 && user <= 10) {
                        System.out.print("Вы не угадали! ");
                        // Если число загаданное программой меньше...
                        if( prog < user ) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            } while( user != prog );
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("До свиданья!");
	}

	/*1)Программа должна считать количество попыток, которое потребовалось 
	 * пользователю, чтобы угадать число. И в конце сообщать, сколько было попыток.
	 * 2)Программа должна загадывать число не из отрезка [1;10], а целое число из 
	 * отрезка от [−10;10], исключая ноль. При этом, постарайтесь, чтобы распределение 
	 * случайных чисел генерируемых программой было равномерных (т. е. в случае 
	 * выпадения нуля его нельзя просто заменить на какое-то другое число, например, 
	 * на 1, ведь тогда 1 будет выпадать с вдвое большей вероятностью, чем остальные числа).
	 * 3)Программа должна подсказывать пользователю, что он ошибся в знаке, если программа 
	 * загадала положительное число, а пользователь ввёл отрицательное. И наоборот.*/
	public static void test0()
	{
		// prog — число созданное программой
        // user — число введённое пользователем
        int prog, user,counter=0;
        // Генерируем случайное целое число от -10 до 10
        do{
        	prog = (int)Math.round((Math.random() * 20) - 10);
        }while(prog==0);
        System.out.println("Я загадала число от 1 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);  
        // Проверяем, есть ли в потоке ввода целое число
        if( input.hasNextInt() ) {
            do {
                // Читаем с потока ввода целое число
                user = input.nextInt();
                counter++;
                if(user == prog) {
                    System.out.println("Вы угадали с "+counter+" попытки");
                } else {
                    // Проверяем, входит ли число в отрезок [-10;10]
                    if (user > -10 && user <= 10) {
                        System.out.print("Вы не угадали!");
                        // Если число загаданное программой меньше...
                        if((prog<0 && user>0) || (prog>0 && user<0))
                        	System.out.println("вы ошиблись знаком");
                        else if( prog < user ) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            } while( user != prog );
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("До свиданья!");
	}

	/*Создайте программу, выводящую на экран все четырёхзначные числа 
	 * последовательности 1000 1003 1006 1009 1012 1015 ….*/
	public static void test1()
	{
		for(int i=1000; i<10000;i=i+5)
		{
			System.out.println(i);
		}
	}

	/*Создайте программу, выводящую на экран первые 55 элементов 
	 * последовательности 1 3 5 7 9 11 13 15 17 ….*/
	public static void test2()
	{
		for(int i=0,a=1; i<55; i++, a=a+2)
			System.out.println(a);
	}

	/*Создайте программу, выводящую на экран все неотрицательные 
	 * элементы последовательности 90 85 80 75 70 65 60 ….*/
	public static void test3()
	{
		for(int i=90; i>0; i=i-5)	System.out.println(i);
	}
	
	/*Создайте программу, выводящую на экран первые 20 элементов 
	 * последовательности 2 4 8 16 32 64 128 ….*/
	public static void test4()
	{
		for(int i=1; i<=20; i++)
			System.out.println((int)Math.pow(2, i));
	}
	
	/*Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.*/
	public static void test5()
	{
		for(int i=0,a=2; a<10000; i++,a=2*a-1)System.out.println(a);
	}

	/*Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.*/
	public static void test6()
	{
		for(int a=-166, i=0; a<100; i++, a=2*a-1+200)
			if(a>-100)System.out.println(a);
	}
	
	/*Создайте программу, вычисляющую факториал натурального числа n, 
	 * которое пользователь введёт с клавиатуры.*/
	public static void test7()
	{
		int a=0,temp;
		Scanner numb=new Scanner(System.in);
		if(numb.hasNextInt())a=numb.nextInt();
		else 
		{
			System.out.println("error");
			return;
		}
		temp=a;
		for(int i=a-1;i>=1;i--)
		{
			temp=temp*i;
		}
		System.out.println(temp);
	}
	
	/*Выведите на экран все положительные делители натурального числа, 
	 * введённого пользователем с клавиатуры.*/
	public static void test8()
	{
		int a=0;
		Scanner str=new Scanner(System.in);
		if(str.hasNextInt())a=str.nextInt();
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)System.out.println(i);
		}
	}
	/*Проверьте, является ли введённое пользователем с клавиатуры натуральное 
	 * число — простым. Постарайтесь не выполнять лишних действий (например, 
	 * после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что 
	 * число составное и проверку продолжать не нужно). Также учтите, что наименьший 
	 * делитель натурального числа n, если он вообще имеется, обязательно располагается 
	 * в отрезке [2; √n].*/
	public static void test9()
	{
		int a=0;
		Scanner str=new Scanner(System.in);
		if(str.hasNextInt())a=str.nextInt();
		for(int i=2; i<Math.floor(a);i++)
		{
			if(a%i==0)
			{
				System.out.println("не простое число.");
				return;
			}
		}
		System.out.println("Простое число.");
	}
	
	/*Создайте программу, выводящую на экран 12 первых элементов 
	 * последовательности 2an-2–2, где a1=3 и a2=2.*/
	public static void test10()
	{
		int a1=3,a2=2,a=0;
		for(int i=0; i<12; i++)
		{
			a=1*a2-2;
			a2=a1;
			a1=a;
			System.out.println(a);
		}
	}
	
	/*Выведите на экран первые 11 членов последовательности Фибоначчи. 
	 * Напоминаем, что первый и второй члены последовательности равны единицам, 
	 * а каждый следующий — сумме двух предыдущих.*/
	public static void test11()
	{
		int a=0,b=1,temp;
		for(int i=0; i<11; i++)
		{
			if(i==0)
			{
				System.out.println(a);
			}
			else if(i==1)
			{
				System.out.println(b);
			}
			else if(i!=0 && i!=1)
			{
				temp=b;
				b=a+b;
				a=temp;
				System.out.println(b);
			}
			
		}
	}
	
	/*Для введённого пользователем с клавиатуры натурального числа 
	 * посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).*/
	public static void test12()
	{
		int a=0,sum=0;
		Scanner str=new Scanner(System.in);
		if(str.hasNextInt())a=str.nextInt();
		while(a>=1)
		{
			sum=sum+a%10;
			a=(int)a/10;
		}
		System.out.println(sum);
	}

	/*В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. 
	 * Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов 
	 * с номерами от 000001 до 999999. «Счастливым» считается билетик у которого 
	 * сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, 
	 * в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить 
	 * сувенир обладателю каждого счастливого билета и теперь раздумывает, 
	 * как много сувениров потребуется. С помощью программы подсчитайте сколько 
	 * счастливых билетов в одном рулоне?*/
	public static void test13()
	{
		int a,b,count=0;
		for(int i=1; i<1000000;i++)
		{
			int suma=0,sumb=0;
			a=(int)i/1000;
			b=i%1000;
			while(a>=1)
			{
				suma=suma+a%10;
				a=(int)a/10;
			}
			while(b>=1)
			{
				sumb=sumb+b%10;
				b=(int)b/10;
			}
			if(suma==sumb)count++;
		}
		System.out.println(count);
	}

	/*В городе N есть большой склад на котором существует 50000 различных полок. 
	 * Для удобства работников руководство склада решило заказать для каждой полки
	 *  табличку с номером от 00001 до 50000 в местной типографии, но когда таблички 
	 *  напечатали, оказалось что печатный станок из-за неисправности не печатал цифру 
	 *  2, поэтому все таблички, в номерах которых содержалась одна или более двойка 
	 *  (например, 00002 или 20202) — надо перепечатывать. Напишите программу, которая 
	 *  подсчитает сколько всего таких ошибочных табличек оказалось в бракованной партии.*/
	public static void test14()
	{
		int count=0;
		for(int i=1; i<=50000; i++)
		{
			String s;
			s=Integer.toString(i);
			if(s.indexOf("2")!=-1)count++;
		}
		System.out.println(count);
	}
	
	/*Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать 
	 * сколько раз за сутки случается так, что слева от двоеточия показывается 
	 * симметричная комбинация для той, что справа от двоеточия (например, 02:20, 
	 * 11:11 или 15:51).*/
	public static void test15()
	{
		int ha,hb,ma,mb,counter=0;
		for(int i=0; i<60; i++)
		{
			ha=i/10;
			hb=i%10;
			for(int j=0; j<60; j++)
			{
				ma=j/10;
				mb=j%10;
				if(ha==mb && hb==ma) 
				{
					System.out.println(i+":"+j);
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

	/*В американской армии считается несчастливым число 13, а в японской — 4. Перед 
	 * международными учениями штаб российской армии решил исключить номера боевой техники, 
	 * содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не 
	 * смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц 
	 * боевой техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько 
	 * всего номеров придётся исключить?*/
	public static void test16()
	{
		int counter=0;
		for(int i=1; i<100000;i++)
		{
			String s=Integer.toString(i);
			if(s.indexOf("4")!=-1)
			{
				counter++;
				System.out.println(i);
			}
			else
			{
				for(int j=0; j<s.length()-1;j++)
				{
					if(s.charAt(j)==49 && s.charAt(j+1)==51)
					{
						counter++;
						System.out.println(i);
					}
				}
			}
		}
		System.out.println(counter);
	}
	
}

