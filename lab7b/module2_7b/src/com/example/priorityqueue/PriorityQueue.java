package com.example.priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue<T extends Comparable<T>> {
    private List<T> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    public void enqueue(T element) {
        heap.add(element);
        Collections.sort(heap); // Sort to maintain the heap order
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return heap.remove(0); // Remove the element with the highest priority (smallest element)
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return heap.get(0); // Return the element with the highest priority without removing it
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    @Override
    public String toString() {
        return heap.toString();
    }
}
