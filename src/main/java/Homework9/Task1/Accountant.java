package Homework9.Task1;

public class Accountant implements Post{
    @Override
    public void printPost() {
        String postName = "Бухгалтер";
        System.out.println("Должность: " + postName);
    }
}
