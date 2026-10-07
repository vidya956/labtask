package com.example;

public class StudentResult {

    public int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public double calculateAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    public String getResult(int m1, int m2, int m3) {
        if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
            return "Pass";
        }
        return "Fail";
    }
}
