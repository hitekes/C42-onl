package Homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        getEvenNumber();
        System.out.println("___________________________");
        getTemperature();
        System.out.println("___________________________");
        getSquare();
        System.out.println("___________________________");
        getSequence();
        System.out.println("___________________________");
        getSum();
    }
    public static void getEvenNumber(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a%2;
        if (b == 0){
            System.out.println("Число четное");
        }
        else System.out.println("Число нечетное");
    }
    public static void getTemperature(){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        if (t>-5){
            System.out.println("Warm");
        } else if (t<=-5 && t>-20){
            System.out.println("Normal");
        } else
            System.out.println("Cold");
    }
    public static void getSquare(){
        int a = 10;
        while(a<=20){
            System.out.println(a*a);
        a++;
        }
    }
    public static void getSequence(){
        int a= 0;
        while(a<98){
            a+=7;
            System.out.println(a);
        }
    }
    public static void getSum(){
        Scanner input = new Scanner(System.in);
        int b = 0;
        while (true) {
            int a = input.nextInt();
            if (a > 0) {
                for (int j = 0; j < a; j++) {
                    b = b + j;
                }
                break;
            } else {
                System.out.println("Введите целое положительное число");
            }
        }
        System.out.println("Сумма чисел равна:" + b);
    }
}
