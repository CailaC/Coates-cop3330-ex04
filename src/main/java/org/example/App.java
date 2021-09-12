package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter a noun:" );
        String noun = input.next();

        System.out.println( "Enter a verb:" );
        String verb = input.next();

        System.out.println( "Enter a adjective:" );
        String adj = input.next();

        System.out.println( "Enter a adverb:" );
        String adv = input.next();


        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");
    }
}
