package Homework9.Task1;

public class Director implements Post{
    @Override
    public void printPost() {
        String postName = "Директор";
        System.out.println("Должность: " + postName);
    }
}
