/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Is the car silent when you turn the key? Enter 'Y' for yes or 'N' for no:");
        Scanner input = new Scanner(System.in);
        String silent = input.nextLine();

        if (silent.equals("y") || silent.equals("Y")){
            System.out.println("Are the battery terminals corroded? Enter 'Y' for yes or 'N' for no:");
            Scanner input2 = new Scanner(System.in);
            String corroded = input2.nextLine();

            if(corroded.equals("Y")||corroded.equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else{
            System.out.println("Does the car make a slicking noise? Enter 'Y' for yes or 'N' for no:");
            Scanner input3 = new Scanner(System.in);
            String noise = input3.nextLine();

            if(noise.equals("Y") || noise.equals("y")){
                System.out.println("Replace the battery.");
            }
            else{
                System.out.println("Does the car crank up but fail to start? Enter 'Y' for yes or 'N' for no:");
                Scanner input4 = new Scanner(System.in);
                String crank = input4.nextLine();

                if (crank.equals("Y") || crank.equals("y")){
                    System.out.println("Check spark plug connections.");
                }
                else {
                    System.out.println("Does the engine start and then die? Enter 'Y' for yes or 'N' for no:");
                    Scanner input5 = new Scanner(System.in);
                    String engine = input5.nextLine();

                    if (engine.equals("Y") || engine.equals("y")) {
                        System.out.println("Does  your car have fuel injection? Enter 'Y' for yes or 'N' for no:");
                        Scanner input6 = new Scanner(System.in);
                        String fuel = input6.nextLine();

                        if(fuel.equals("Y") || fuel.equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}