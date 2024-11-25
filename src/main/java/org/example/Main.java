package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the first float number");
        float value1= Float.parseFloat(br.readLine());
        System.out.println("Please enter the second  float number");
         float value2= Float.parseFloat(br.readLine());
         Context context= new Context(new Addition());
         System.out.println(context.excuteStrategy(value1,value2));

        Context context1= new Context(new Subtraction());
        System.out.println(context1.excuteStrategy(value1,value2));

        Context context2= new Context(new Multiplication());
        System.out.println(context2.excuteStrategy(value1,value2));
        }
    }
