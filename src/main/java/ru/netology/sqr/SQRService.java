package ru.netology.sqr;

public class SQRService {
    public long calculate(long start, long finish) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ((start <= (i * i)) & ((i * i) <= finish)) {
                counter++;
            }
        }

        return counter;
    }
}
