package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String chosenCharacter = "";
        String chosenWeapon = "";
        Weapons weapons = new Weapons();
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Which player do you want to choose? Choose by number.\n");
        //System.out.printf("\nTotal players: \n" + player.count+"\n");
        for (int i = 0; i<= player.count-1; i++){
            System.out.printf(i+1+": "+player.player.get(i)+"\n");
        }

//Select Player

        System.out.printf("\n Enter number: ");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.printf("You are the Racer!!!");
                chosenCharacter = player.player.get(0);
                break;
            case 2:
                System.out.printf("You are the Hunter!!!");
                chosenCharacter = player.player.get(1);
                break;
            case 3:
                System.out.printf("You are the Astronaut!!!");
                chosenCharacter = player.player.get(2);
                break;
            case 4:
                System.out.printf("You are the Policeman!!!");
                chosenCharacter = player.player.get(3);
                break;
            case 5:
                System.out.printf("You are the Batman!!!");
                chosenCharacter = player.player.get(4);
                break;
            default:
                System.out.printf("Select a number given to characters.");
        }

//Select weapon

        System.out.printf("\nWhich weapon do you want to choose for your player ? Choose by number.\n");

        for (int i = 0; i<= weapons.count-1; i++){
            System.out.printf(i+1+": "+weapons.weapons.get(i)+"\n");
        }
        System.out.printf("\n Enter number: ");
        int b = scanner.nextInt();
        switch (a){
            case 1:
                System.out.printf("Knife!!! good choice");
                chosenWeapon = weapons.weapons.get(0);
                break;
            case 2:
                System.out.printf("Sword!!! Samurai");
                chosenWeapon = weapons.weapons.get(1);
                break;
            case 3:
                System.out.printf("Exe-Bow!!!");
                chosenWeapon = weapons.weapons.get(2);
                break;
            case 4:
                System.out.printf("Pistol!!!");
                chosenWeapon = weapons.weapons.get(3);
                break;
            case 5:
                System.out.printf("A Machine gun!!!");
                chosenWeapon = weapons.weapons.get(4);
                break;
            case 6:
                System.out.printf("Spear!!!");
                chosenWeapon = weapons.weapons.get(5);
                break;
            default:
                System.out.printf("Select a number given to characters.");
        }
        System.out.printf("\n"+chosenCharacter+" With a "+chosenWeapon+"\n");

        System.out.printf("Enter Fire to use the weapon.\n");
        System.out.printf("Enter: ");
        String fire = scanner.next();
        if(fire.equals("Fire")){
            switch (chosenWeapon){
                case "Knife":
                    System.out.printf(chosenWeapon+" Attack");
                    break;
                case "Sword":
                    System.out.printf(chosenWeapon+" Attack");
                    break;
                case "Exe-Bow":
                    System.out.printf(chosenWeapon+" Attack");
                    break;
                case "Pistol":
                    System.out.printf(chosenWeapon+" Attack");
                    break;
                case "Machine gun":
                    System.out.printf(chosenWeapon+" Attack");
                    break;
                case "Spear":
                    System.out.printf(chosenWeapon+" Attack");
                    break;
                default:
                    System.out.printf("Attaaaaaaack!!!!");
            }
        }
        else {
            System.out.printf("Enter Fire command!!");
        }

    }

}
