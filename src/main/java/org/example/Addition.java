package org.example;

public class Addition implements Strategy{
    @Override
    public float Calculation(float number1, float number2) {
        return number1+number2;
    }
}