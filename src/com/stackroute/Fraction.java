package com.stackroute;
/*
Program 4
        ## Problem Statement: Find the fraction of two integers
        **Given two integers find the fraction and handle runtime exception using try and
        catch**
        **This exercise contains a class named Fraction with the following method:**
        +fractionCalculator(int, int) : String
        - Should take two integer values as input and return a string as result
        - Should also handle exceptions thrown by logic using try and catch
        ## Example
        Sample Input:
        120 3
        Expected Output:
        40
        --------------------------------------------------------
        Sample Input:
        1200 0
        Expected Output:
        java.lang.ArithmeticException: / by zero
*/
import java.util.Scanner;
public class Fraction {
    //Method for Calculating Fraction
    public static String fractionCalculator(int valueOne, int valueTwo){
        String result="";
        try {
            result+=valueOne/valueTwo;
        }catch (ArithmeticException e){
            result+=e;
        }
        return result;
    }
    //Main Method Driver Code
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two integer values");
        int valueOne=scanner.nextInt();
        int valueTwo=scanner.nextInt();
        String string=fractionCalculator(valueOne,valueTwo);
        System.out.println(string);
    }
}
