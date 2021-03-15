package com.magiccalc;

// Imports the Calculator class form com.calc
import com.calc.Calculator;

class MagicCalculator extends Calculator
{
    static double squareRoot(double num)
    {
        num = Math.sqrt(num);
        return num;
    }

    static double sin(double num)
    {
        num = Math.sin(num);
        return num;
    }

    static double cosine(double num)
    {
        num = Math.cos(num);
        return num;
    }

    static double tangent(double num)
    {
        num = Math.tan(num);
        return num;
    }

    static long factorial(long num)
    {

        long n = 1;
        for(long i = 1; i <= num; i++)
        {
            n = n * i;
        }
        return n;
    }

    // Main - used to test
    public static void main(String[] args)
    {
        System.out.println(addition(2, 3));
        System.out.println(subtraction(32, 18));
        System.out.println(multiplication(4, 3));
        System.out.println(division(18, 6));
        System.out.println(square(5));
        System.out.println(squareRoot(16));
        System.out.println(sin(3));
        System.out.println(cosine(8));
        System.out.println(tangent(6));
        System.out.println(factorial(5));

    }

}
