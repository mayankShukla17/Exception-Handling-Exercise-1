package com.stackroute;
/*
Program1
        Create a class with a main( ) that throws an object of class Exception inside a try block.
        a. Give the constructor for Exception a String argument.
        b. Catch the exception inside a catch clause and print the String argument.
        c. Add a finally clause and print a message to prove you were there.
*/
public class MyException extends Exception {
    String message;

    //Constructor
    MyException(String message) {
        this.message=message;
    }

    //toString() for printing message
    public String toString(){
        return ("MyException Occurred: "+message) ;
    }

    //Main Method Driver Code
    public static void main(String[] args) {
        try{
            System.out.println("Starting of try block");
            // I'm throwing the custom exception using throw
            throw new MyException("This is My error Message");
        }
        catch(MyException exp){
            System.out.println("Catch Block") ;
            System.out.println(exp) ;
        } finally {
            // This block will get get executed whether exception occurs or not.
            System.out.println("Finally Block printed");
        }
    }
}
