package com.work;

import com.work.utils.configUtils;

public class Game {
    private Player player;

    public void start() {
        configUtils.println("Welcome to the game!");
        String name = configUtils.askString("Enter your character's name: ");
        int age = configUtils.askInt("Enter your character's age: ");
        player = new Player(name, age);
        configUtils.println("Character created successfully!");
    }

    public void firstDecision() {
        configUtils.println("You are in a dark forest. You can go left or right.");
        
        while (true) {
            String decission = configUtils.askString("What do you want to do? (explore/ check inventory/ check stats/ exit)");
            
            if (decission.equalsIgnoreCase("explore")) {
                configUtils.println("You explore the forest and find a treasure chest!");
                player.gainGold(100);
                configUtils.println("You gained 100 gold!");
            } else if (decission.equalsIgnoreCase("check inventory")) {
                player.getInventario();
            } else if (decission.equalsIgnoreCase("check stats")) {
                configUtils.println("Name: " + player.getName());
                configUtils.println("Age: " + player.getEdad());
            } else if (decission.equalsIgnoreCase("exit")) {
                configUtils.closeScanner();
                break;
            } else {
                configUtils.println("Invalid choice. Please try again.");
            }
        }
    }

    private void explore(){
        String direction = configUtils.askString('Do you want to explore north, south, east or west?');

        switch(direction.toLowerCase()){
            case "north":
                configUtils.println("You find a treasure chest!");
                break;
            case "south":
                configUtils.println("You encounter a wild beast!");
                break;
            case "east":
                configUtils.println("You find a hidden path!");
                break;
            case "west":
                configUtils.println("You find a mysterious cave!");
                break;
            default:
                configUtils.println("Invalid direction. Please try again.");
        }
    }
}
