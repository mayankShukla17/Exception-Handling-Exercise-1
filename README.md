#Exception Handling Exercise-1
1. Program1
Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.
2. Program2
Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each
exception by
displaying the message stored in the exception object.
3. Program3
## Problem Statement: Find character at specified location in a string
**Given a string find the character in particular location in the string**
**This exercise contains a class named CharacterFinder with the following method:**
+characterLocator(String, String) : character
- Should take two String values as input and return a character as result
- Should also handle exception thrown by logic using try and catch
Sample Input:
This is a demo sentence, 8
Expected Output:
a
--------------------------------------------------------
Sample Input:
This is a demo sentence, xyz
Expected Output:
NumberFormatException
--------------------------------------------------------
Sample Input:
This is a demo sentence, 40
Expected Output:
StringIndexOutOfBoundsException
4. Program 4
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