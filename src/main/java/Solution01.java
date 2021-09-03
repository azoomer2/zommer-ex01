/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Zommer
 */


import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String input = scan.nextLine();
        String output = "Hello, " + input + ", nice to meet you!";
        System.out.println(output);

    }
}
/* Psuedo Code

    prompt user for input
    System.in 'input'
    output = 'input' + text
    System.out 'output'

 */