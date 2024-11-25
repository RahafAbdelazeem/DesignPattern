package org.example;

public class Context {
     private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
     public   float excuteStrategy( float num1,float num2){
        return  strategy.Calculation(num1,num2);
     }
}
