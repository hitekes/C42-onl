package Homework2;

public class Homework2 {
    public static void main(String[] args) {
        task1();
        System.out.println("___________________________");
        task2();
        System.out.println("___________________________");
        task3();
        System.out.println("___________________________");
        task4();
        System.out.println("___________________________");
        task5();
        System.out.println("___________________________");
        taskBonus();
    }
    public static void task1() {
        int b = 5;
        int c = 45;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);
    }
    public static void task2() {
        int n = 28;
        int a = n/10;
        int b = n%10;
        int c = a+b;
        System.out.println(c);
    }
    public static void task3() {
        int n = 369;
        int a = n/100;
        int b = n-a*100;
        int c = b/10;
        int d = b%10;
        int e = a+c+d;
        System.out.println(e);
    }
    public static void task4() {
        double n = 5.245446656;
        int a = (int) n;
        System.out.println(a);
    }
    public static void task5() {
        int q = 25;
        int w = 20;
        int a = q/w;
        int b = q%w;
        System.out.println("Результат деления = " + a + "\n" + "Остаток  = " + b);
    }
    public static void taskBonus() {
        int a = 1;
        int b = 2;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Вывод а: " + a);
        System.out.println("Вывод b: " + b);
    }
}