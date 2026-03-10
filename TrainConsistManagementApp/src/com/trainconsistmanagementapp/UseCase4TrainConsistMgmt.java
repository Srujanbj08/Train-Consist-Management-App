package com.trainconsistmanagementapp;
import java.util.LinkedHashSet;
import java.util.Set;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("UC4 - Maintain Ordered Bogie Consist");

        Set<String> trainConsist = new LinkedHashSet<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        trainConsist.add("Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car':");
        System.out.println(trainConsist);

        trainConsist.remove("Engine");
        trainConsist.remove("Guard");

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed");
    }
}