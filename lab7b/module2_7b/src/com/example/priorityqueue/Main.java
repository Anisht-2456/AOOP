package com.example.priorityqueue;

public class Main {

    public static void main(String[] args) {
        // Test PriorityQueue with Integer
        PriorityQueue<Integer> intQueue = new PriorityQueue<>();
        intQueue.enqueue(30);
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        System.out.println("Integer PriorityQueue: " + intQueue);
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("Peek: " + intQueue.peek());
        System.out.println("Is Empty: " + intQueue.isEmpty());
        System.out.println("Size: " + intQueue.size());
        
        // Test PriorityQueue with Double
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>();
        doubleQueue.enqueue(30.5);
        doubleQueue.enqueue(10.2);
        doubleQueue.enqueue(20.3);
        System.out.println("\nDouble PriorityQueue: " + doubleQueue);
        System.out.println("Dequeue: " + doubleQueue.dequeue());
        System.out.println("Peek: " + doubleQueue.peek());
        System.out.println("Is Empty: " + doubleQueue.isEmpty());
        System.out.println("Size: " + doubleQueue.size());

        // Test PriorityQueue with String
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Cherry");
        System.out.println("\nString PriorityQueue: " + stringQueue);
        System.out.println("Dequeue: " + stringQueue.dequeue());
        System.out.println("Peek: " + stringQueue.peek());
        System.out.println("Is Empty: " + stringQueue.isEmpty());
        System.out.println("Size: " + stringQueue.size());
    }
}
