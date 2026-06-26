package Homework6.Task1;

import java.util.Scanner;

public class CreditCard {
    public String accountNumber;
    public double currentAmount;

    public void addMoney(){
        Scanner input = new Scanner(System.in);
        System.out.println("На какую сумму пополнить?");
        double depositAmount = input.nextDouble();
        currentAmount += depositAmount;
        System.out.println("Теперь на вашем счету: " + currentAmount);
    }
    public void withdrawMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Какую сумму снять?");
        double debitAmount = input.nextDouble();
        currentAmount -= debitAmount;
        System.out.println("На вашем счету осталось: " + currentAmount);
    }
    public String getCardInfo(){
        return "Данные о карте: \n" +
                "Номер счета: " + accountNumber +
                "\n Текущий баланс: " + currentAmount;
    }


}
