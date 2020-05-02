package org.example.calculator;

import java.util.Scanner;

class Source {
    public static void main (String args[]) {
        Calculator calc1 = new Calculator();
        Scanner in = new Scanner(System.in);
        double number1, number2;
        char action;
        System.out.print("Input number1: ");
        if(in.hasNextDouble()) {
            number1 = in.nextDouble();
        } else {
            in.next();
            number1 = 0;
        }
        System.out.print("Input number2: ");
        if(in.hasNextDouble()) {
            number2 = in.nextDouble();
        } else {
            in.next();
            number2 = 0;
        }
        System.out.print("Input action: ");
        action = in.next().charAt(0);
        switch(action) {
            case '+':
                System.out.println(calc1.Add(number1, number2));
                break;
            case '-':
                System.out.println(calc1.Minus(number1, number2));
                break;
            case '*':
                System.out.println(calc1.Multiply(number1, number2));
                break;
            case '/':
                System.out.println(calc1.Div(number1, number2));
                break;
            case '>':
                System.out.println(calc1.Max(number1, number2));
                break;
            case '<':
                System.out.println(calc1.Min(number1, number2));
                break;
            case '^':
                System.out.println(calc1.Power(number1, number2));
                break;
            case '%':
                System.out.println(calc1.Percent(number1, number2)+"%");
                break;   
        }
        in.close();       
    }
}
