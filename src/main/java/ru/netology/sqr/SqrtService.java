package ru.netology.sqr;

public class SqrtService {

    public int rangeOfNumbers(int lowerLimit, int upperLimit) {

        int counter =0;
        for (int i = 0; i <= 99; i++) {
            if ((i * i >= lowerLimit) && (i * i <= upperLimit)) {
                    counter++;
                }

        }
        System.out.println(counter);
        return counter;
    }



}

