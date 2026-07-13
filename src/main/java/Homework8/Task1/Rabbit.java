package Homework8.Task1;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик пищит");
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat")) {
            System.out.println("Кролик не ест мясо");
        } else if (food.equals("grass")) {
            System.out.println("Кролик ест траву");
        } else
            System.out.println("Кролик не будет есть " + food);
    }
}

