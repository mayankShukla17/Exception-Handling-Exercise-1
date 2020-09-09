package com.stackroute;
/*
Program3
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
*/
import java.util.Scanner;
public class CharacterFinder {
    //Method to find the character at specified location
    public static char characterLocator(String string, String search){
        char character=' ';
        try {
            int position=Integer.parseInt(search);
            if (position>string.length())
                throw new StringIndexOutOfBoundsException();
            character=string.charAt(position);
        }catch (StringIndexOutOfBoundsException | NumberFormatException e){
            System.out.println(e);
        }
        return character;
    }
    //Main Method Driver Code
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String string=scanner.nextLine();
        System.out.println("Enter the position to search");
        String searchPosition=scanner.next();
        char charResult=characterLocator(string,searchPosition);
        System.out.println(charResult);
    }
}
