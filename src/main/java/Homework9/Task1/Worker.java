package Homework9.Task1;

public class Worker implements Post{
    @Override
    public void printPost() {
        String postName = "Рабочий";
        System.out.println("Должность: " + postName);
    }
}
