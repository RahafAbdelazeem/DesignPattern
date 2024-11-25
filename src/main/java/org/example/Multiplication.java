package org.example;

public class Multiplication implements Strategy{
    @Override
    public float Calculation(float number1, float number2) {
        return number1* number2;
    }
}
