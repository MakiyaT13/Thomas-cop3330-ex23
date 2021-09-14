/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key?");
        String an1 = input.nextLine();

        if (an1 == "yes"){
            System.out.print("Are the battery terminals corroded?");
            String an2 = input.nextLine();

            if (an2 == "yes"){
                System.out.print("Clean terminals and try starting again.");
            }
            else{
                System.out.print("Replace cables and try again.");
            }
        }
        else{
            System.out.print("Does the car make a slicking noise?");
            String an3 = input.nextLine();

            if (an3 == "yes"){
                System.out.print("Replace the battery.");
            }
            else{
                System.out.print("Does the car crank up but fail to start?");
                String an4 = input.nextLine();

                if (an4 == "yes"){
                    System.out.print("Check spark plug connections.");
                }
                else{
                    System.out.print("Does the engine start and then die?");
                    String an5 = input.nextLine();
                    if (an5 == "yes"){
                        System.out.print("Does you car have fuel injection?");
                        String an6 = input.nextLine();

                        if (an6 == "yes"){
                            System.out.print("Get it in for service.");
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.print("This should not be possible.;");
                    }
                }
            }
        }

    }
}