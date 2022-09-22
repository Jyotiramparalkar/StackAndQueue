package com.bridgelabz;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("Stacks and Queues program");

        StackOperations stackOperations = new StackOperations();
        stackOperations.push(70);
        stackOperations.push(30);
        stackOperations.push(56);

        stackOperations.show();


    }
}