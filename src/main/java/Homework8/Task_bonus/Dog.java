package Homework8.Task_bonus;

public class Dog {
    // Запрет на создание экземпляра класса
    // Поле private доступно только в этом классе,поэтому нельзя создать экземпляр
    private Dog() {
        System.out.println("Собака создана");
    }

    // Способ обойти ограничение
    // С помощью статического метода можно обратиться ко всем переменным и методам класса
    public static Dog createDog() {
        return new Dog();
    }

    public void voice() {
        System.out.println("Собака гавкает");
    }

    public void eat() {
        System.out.println("Собака ест");
    }
}