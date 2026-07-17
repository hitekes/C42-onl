package Homework10.Task1;

public class Main {
    public static void main(String[] args){
        User user1 = new User(505,"oleh","Oleg","Ivanov");
        User user2 = new User(505,"oleh","Oleg","Ivanov");
        User user3 = new User(404, "petrov375", "Petr", "Petrov");
        System.out.println("Сравнение user1 и user2:\n" +
                user1.equals(user2) +
                "\nСравнение user2 и user3\n" +
                user2.equals(user3));
        System.out.println("\nСравнение хэш-кода user1 и user2\n" +
                (user1.hashCode() == user2.hashCode()));
    }
}
