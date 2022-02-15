package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateForAverageVolue() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long start = 200;
        long finish = 300;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(start, finish);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForMinimumVolue() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long start = 0;
        long finish = 10;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(start, finish);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForMaxmumVolue() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        long start = 0;
        long finish = 10000;
        long expected = 90;

        // вызываем целевой метод:
        long actual = service.calculate(start, finish);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        assertEquals(expected, actual);
    }

}
