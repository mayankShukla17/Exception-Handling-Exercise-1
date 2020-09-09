package com.stackroute;
/*
Program 6
        You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int).
        This method takes two integers n  and p, as parameters and finds n^p. If either n or p  is negative, then the method must throw an exception which says  " n or p should
        not be negative".
        Also, if both n and p  are zero, then the method must throw an exception which says  "n and p should not be zero"
        For example, -4 and -5 would result in “ java.lang.Exception: n or p should not be negative”
        Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.

        Sample Input 0
        3 5
        2 4
        0 0
        -1 -2
        -1 3

        Sample Output 0
        243
        16
        java.lang.Exception: n and p should not be zero.
        java.lang.Exception: n or p should not be negative.
        java.lang.Exception: n or p should not be negative.
*/
import java.util.Scanner;
public class MyCalculator {
    //Create the method long power(int, int) here.
    public static long power(int n,int p){
        long result=0;
        if(n==0 && p==0) {
            try {
                throw new Exception("n and p should not be zero.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(n<0 || p<0) {
            try {
                throw new Exception("n or p should not be negative.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            result=(long)Math.pow(n, p);
        }
        return result;
    }
    //Main Method Driver Code
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter both the values to calculate power");
        int n=scanner.nextInt();
        int p=scanner.nextInt();
        long power=power(n,p);
        System.out.println(power);
    }
}
