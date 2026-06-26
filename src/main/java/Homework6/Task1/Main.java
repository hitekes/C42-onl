package Homework6.Task1;

public class Main {
    public static void main(String[] args) {
        CreditCard first = new CreditCard();
        first.accountNumber = "N787865DB46645";
        first.currentAmount = 100_000;

        CreditCard second = new CreditCard();
        second.accountNumber = "N527539DB98787";
        second.currentAmount = 500_000;

        CreditCard third = new CreditCard();
        third.accountNumber = "N8749786DB11570";
        third.currentAmount = 50_000;

        transferFirstCard(first);
        transferSecondCard(second);
        transferThirdCard(third);
        getCardInfo(first, second, third);
    }

    public static void transferFirstCard(CreditCard first) {
        System.out.println("Счет номер: " + first.accountNumber);
        System.out.println("На вашем счету: " + first.currentAmount);
        first.addMoney();
        System.out.println("-------------------------------------------");
    }

    public static void transferSecondCard(CreditCard second) {
        System.out.println("Счет номер: " + second.accountNumber);
        System.out.println("На вашем счету: " + second.currentAmount);
        second.addMoney();
        System.out.println("-------------------------------------------");
    }

    public static void transferThirdCard(CreditCard third) {
        System.out.println("Счет номер: " + third.accountNumber);
        System.out.println("На вашем счету: " + third.currentAmount);
        third.withdrawMoney();
        System.out.println("-------------------------------------------");
    }

    public static void getCardInfo(CreditCard first, CreditCard second, CreditCard third) {
        System.out.println(first.getCardInfo());
        System.out.println(second.getCardInfo());
        System.out.println(third.getCardInfo());
    }
}
