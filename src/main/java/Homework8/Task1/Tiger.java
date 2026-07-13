package Homework8.Task1;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Тигр рычит");
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat")) {
            System.out.println("Тигр ест мясо");
        } else if (food.equals("grass")) {
            System.out.println("Тигр не ест траву");
        } else
            System.out.println("Тигр не будет есть " + food);
    }
}

