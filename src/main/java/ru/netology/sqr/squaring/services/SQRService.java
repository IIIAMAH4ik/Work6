package ru.netology.sqr.squaring.services;

import java.sql.SQLOutput;

public class SQRService {
    public long calculate(long amount, boolean registered) {
        int range = 10;
        int min = 200;
        int max = 300;
        int sqrScore=0;
        while (range<100) {
        if (range * range >= min && range * range <= max) {
           sqrScore = sqrScore +1;
        }
        range = range +1;
        }
        return amount;
    }
}