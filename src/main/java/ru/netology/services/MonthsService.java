package ru.netology.services;

public class MonthsService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету изначально

        // Проходим по всем 12 месяцам года
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Условие выполнено: можем отдыхать
                count++; // увеличиваем счётчик месяцев отдыха

                // Тратим обязательные расходы
                money = money - expenses;

                // Остаток накоплений уменьшается в три раза
                // Целочисленное деление в Java автоматически отбросит дробную часть
                money = money / 3;
            } else {
                // Условие не выполнено: придётся работать
                money = money + income - expenses;
            }
        }

        return count;
    }
}