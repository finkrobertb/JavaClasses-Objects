package com.calc;

public class Calculator
{

    protected static int addition(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    protected static int subtraction(int num1, int num2)
    {
        int difference = num1 - num2;
        return difference;
    }

    protected static int multiplication(int num1, int num2)
    {
        int product = num1 * num2;
        return product;
    }

    protected static int division(int num1, int num2)
    {
        int quotient = num1 / num2;
        return quotient;
    }

    protected static int square(int num1)
    {
        int square = num1 * num1;
        return square;
    }

}
