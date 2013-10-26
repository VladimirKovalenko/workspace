import java.util.Scanner;

public class Main_9 {
	
	public static void isPrimeMain()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        if(sc.hasNextInt()) {
            int u = sc.nextInt();
            if(u > 0) {
                if(isPrime(u)) {
                    System.out.println("Вы ввели простое число");
                } else {
                    System.out.print("Простые делители числа: ");
                    for(int i = (int)Math.sqrt(u); i >= 2  ; i--) {
                        if(u%i == 0 && isPrime(i)) {
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Вы ввели не положительное число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
	
    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void kvadrMain() {
		// TODO Auto-generated method stub
    	 int a = 25;
    	 System.out.println(kvadk(a));
    	 // 5.0
    	 System.out.println(a);
    	 // 25
	}
     
    public static double kvadk (double a) 
    {
    	  double t;
    	  t = Math.pow(a, 0.5);
    	  return t;
    }
     
    static void pr( double a) {
    	  System.out.println(a);
    	}
    
    static void pr (String a) {
	  System.out.println(a);
	}
	
    static void pr(int[] a) {
	  for (int i=0; i<a.length; i++) {
	    System.out.print(a[i]+" ");
	  }
	  System.out.println();
	}
    	
	private static void prMain() {
		// TODO Auto-generated method stub
		int a = 5;
		int [] m = {1, 2, 8, 3};
		String s = "Мир";
		pr (a); //работает исходный метод
		pr (a+s); // 5 мир, работает первая перегрузка
		pr (m); // 1 2 8 3
//		pr (m+a); // ошибка
	}
	
    public static void main(String[] args) 
    {
//    	 isPrimeMain();
//    	 kvadrMain();
    	prMain();
    }
}