package com.work;

public class Player {
    private String name;
    private int edad;
    private boolean isAlive = true;
    private String[] inventario;
    private int inventarioSize = 10;
    private int maxInventarioSize = 30;

    public int getAgeFactorial() {
        int factorial = 1;
        for (int i = 1; i <= edad; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public Player(String name, int edad) {
        this.name = name;
        this.edad = edad;
        inventario = new String[inventarioSize];
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public void levelup() {
        Level++;
        Strength += 5;
        Agility += 5;
        Intelligence += 5;
        Health += 10;
        Mana += 10;
        increaseInventorySize();
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void die() {
        isAlive = false;
    }

    public void gainExperience(int exp) {
        Experience += exp;
        if (Experience >= 100) {
            levelup();
            Experience = 0;
        }
    }

    public void gainGold(int gold) {
        Gold += gold;
    }

    public void addItemToInventory(String item) {
        if (inventarioSize < maxInventarioSize) {
            for (int i = 0; i < inventario.length; i++) {
                if (inventario[i] == null) {
                    inventario[i] = item;
                    break;
                }
                else {
                    System.out.println("El inventario esta lleno.");
                }
            }
        } else {
            System.out.println("El inventario esta lleno.");
        }
    }

    public void increaseInventorySize() {
        if (inventarioSize < maxInventarioSize) {
            inventarioSize += 1;
            String[] newInventario = new String[inventarioSize];
            for (int i = 0; i < inventario.length; i++) {
                newInventario[i] = inventario[i];
            }
            inventario = newInventario;
        }
        else {
            System.out.println("Has alcanzado el tamaño maximo del inventario.");
        }
    }

    int Health = 100;
    int Mana = 100;
    int Strength = 10;
    int Agility = 10;
    int Intelligence = 10;
    int Experience = 0;
    int Level = 1;
    int Gold = 0;

}


