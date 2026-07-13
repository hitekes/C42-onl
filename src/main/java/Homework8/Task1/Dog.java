package Homework8.Task1;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat")) {
            System.out.println("Собака ест мясо");
        } else if (food.equals("grass")) {
            System.out.println("Собака не ест траву");
        } else
            System.out.println("Собака не будет есть " + food);
    }
}
