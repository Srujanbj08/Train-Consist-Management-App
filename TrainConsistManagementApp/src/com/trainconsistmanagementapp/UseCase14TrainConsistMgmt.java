package com.trainconsistmanagementapp;
public class UseCase14TrainConsistMgmt {

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Invalid bogie capacity: " + capacity);
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("UC14 - Handle Invalid Bogie Capacity");

        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println(b1.name + " -> " + b1.capacity);

            Bogie b2 = new Bogie("AC Chair", -10);
            System.out.println(b2.name + " -> " + b2.capacity);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}