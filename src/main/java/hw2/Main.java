package hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberAnimals = scanner.nextInt();
        Pets[] pets = new Pets[numberAnimals];
        int x = 0;
        while (x <= numberAnimals) {
            String name;
            String noise;
            Pets pet;
            System.out.println("what kind of pet(s)?");
            String blank = scanner.nextLine();
            String typeOfPet = scanner.nextLine();

            System.out.println("Whats their name?");
            name = scanner.nextLine();
            System.out.println("What do they sound like?");
            noise = scanner.nextLine();
            if (typeOfPet.equalsIgnoreCase("Dog")) {
                pet = new Dog(name, noise);
            }
            x++;
        }
    }
}

