package org.example.calculator;
public class Calculator {
    private double result;
    public Calculator() {
        result = 0;
    }
    /**
     * @param number1 first number
     * @param number2 second number
     * @return Sum elements
     */
    public double Add(double number1, double number2) {
        result = number1 + number2;
        return result;
    }
    /**
     * @param number1 first number
     * @param number2 second number
     * @return Multiply elements
     */
    public double Multiply(double number1, double number2) {
        result = number1 * number2;
        return result;
    }
    /**
     * @param number1 first number
     * @param number2 second number
     * @return Minus elements
     */
    public double Minus(double number1, double number2) {
        result = number1 - number2;
        return result;
    }
    /**
     * @param number1 first number
     * @param number2 second number
     * @return Division elements
     */
    public double Div(double number1, double number2) {
        result = number1 / number2;
        return result;
    }
    /**
     * @param number1 first number
     * @param number2 second number
     * @return Largest of these numbers
     */
    public double Max(double number1, double number2) {
        if(number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }
    /**
     * @param number1 first number
     * @param number2 second number
     * @return Minimum of these numbers
     */
    public double Min(double number1, double number2) {
        if(number1 > number2) {
            return number2;
        } else {
            return number1;
        }
    }
    /**
     * @param number1 first number
     * @param number2 second number
     * @return Power of numbers
     */
    public double Power(double number1, double number2) {
        return Math.pow(number1, number2);
    }
    /**
     * @param number1 first number
     * @param number2 second number
     * @return How many percent is one number from another
     */
    public double Percent(double number1, double number2) {
        return (number1 / number2) * 100;
    }
}
