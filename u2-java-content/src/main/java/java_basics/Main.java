package java_basics;

// TODO: import Scanner from java.util

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* PRINTING TO THE CONSOLE */

        // TODO: Use System.out to print to the console
        System.out.println("Welcome to unit 2!");

        /* DECLARING AND INITIALIZING VARIABLES */

        // TODO: Declare and initialize several variables and print them to the console
        String newFaveShow = "Switched at Birth";
        String faveActor = "Vanessa Marano";
        String faveCharacter = "Bay Kennish";
        String faveLoveInterest = "Emmet Bledsoe";

        System.out.println("My new favorite show is " + newFaveShow + ", starring " + faveActor + ", as " + faveCharacter + ". My favorite love interest is " + faveLoveInterest + ".");

        char letter = 'a';
        char digit = '5';
        char punctuation = '!';
        char newline = '\n'; //escape characters are not counted as a character

        System.out.println(letter + digit + punctuation + newline); //prints 193 b/c of unicode

        //Number types
        int niceRoundNumber = 7;
//        float decimalNumber = 1.234578;
        float smallDecimalNumber = (float) -1.2394; //not widely used anymore
        float anotherSmallDecimalNumber = (float)28.15;
        double largeDecimalNumber = 33.49820292828;

        System.out.println(niceRoundNumber);
        System.out.println(smallDecimalNumber);
        System.out.println(anotherSmallDecimalNumber);
        System.out.println(largeDecimalNumber);

        /* WRITING METHODS */

        // TODO: After coding your method below main(), call it here and print the result
        System.out.println(getFullName("Kim", "Taehyung")); //allowed b/c in same class as method


        /* USING METHODS FROM OTHER CLASSES */

        // TODO: Call each of the static methods from the Examples class in same package
        Methods.sayHello("Bob"); //name class and use dot notation with STATIC METHODS
        System.out.println(Methods.addThreeNums(2,5,9));


        /* USING SCANNER TO GET USER INPUT */

        // TODO: Declare and initialize a Scanner object using System.in
        Scanner userInput = new Scanner(System.in); //method to get input

        // TODO: Get user input
        // Precede your input with output to the user so they know what you need
        System.out.print("Enter a whole number:");

        // Receive the input and store it in a variable
        int userNumber = userInput.nextInt(); //left side of equal sign stores, right obtains

        // Do something with the stored user input
        System.out.println("Your number is: " + userNumber);

        // Always close the Scanner object at the end of the main method
        // for efficiency and security
        // TODO: Close Scanner
        userInput.close();

    }

    // TODO: Code a method to return a full name as a String using firstName and lastName
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}
