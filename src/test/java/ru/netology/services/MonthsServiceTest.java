package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonthsServiceTest {

    @Test
    public void shouldCalculateThreeMonths() {
        MonthsService service = new MonthsService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateTwoMonths() {
        MonthsService service = new MonthsService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateZeroMonthsIfThresholdNeverReached() {
        MonthsService service = new MonthsService();

        int income = 1_000;
        int expenses = 3_000; // каждый месяц уходим в минус или остаемся на месте
        int threshold = 100_000;
        int expected = 0;

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }
}
