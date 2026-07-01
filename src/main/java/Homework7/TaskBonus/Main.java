package Homework7.TaskBonus;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("Красный");
        System.out.println("Цвет яблока: " + apple.getColor());

        apple = new Apple("Зеленый");
        System.out.println("Новый цвет яблока: " + apple.getColor());
    }
}
