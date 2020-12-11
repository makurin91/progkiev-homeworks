package com.gmail.some;


/*
Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
Реализовать в классе методы setBalance() который будет задавать баланс ,
credit() метод должен начислять средства на счет, debit() - снимать средства со  счета.
Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение :
“Сумма снятия больше чем остаток на счету!” . Создать обьект класса и проверить работу программы..
 */

public class BankAccount {
    private final int accountNumber = 123;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double add) {
        balance = balance + add;
    }

    public void debit(double add) {
        if (add > balance) {
            System.out.println("Сумма снятия больше чем остаок на счету!");
            return;
        }
        balance = balance - add;
    }

    public static void main(String[] args) {
        final BankAccount bankaccount = new BankAccount();
        bankaccount.setBalance(100);
        bankaccount.credit(20);
        bankaccount.debit(119);

        System.out.println(bankaccount.balance);
        bankaccount.debit(2);
    }
}
