
package ru.netology.services;

public class FinanceService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { 
                money = (money - expenses) / 3;
                count++;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }

}

