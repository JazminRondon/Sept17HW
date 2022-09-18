package Tempature;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What's the temperature feel like?\n"
                + "High\nLow\nHumid\n");
                String input=userInput.nextLine();
                if(input.equalsIgnoreCase("high")){
                    System.out.println("Sunblock may be needed");
                }
                if(input.equalsIgnoreCase("low")){
                    System.out.println("A coat may be needed");
                }
                if(input.equalsIgnoreCase("humid")){
                    System.out.println("Its muggy!");
                }
    }
        }


//https://stackoverflow.com/questions/43313555/basic-java-input-response
//https://www.youtube.com/watch?v=wAEPokhj5Q4