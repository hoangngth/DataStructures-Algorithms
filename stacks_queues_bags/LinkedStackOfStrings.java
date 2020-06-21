package stacks_queues_bags;

import java.io.*;
import java.util.Scanner;

public class LinkedStackOfStrings {

    private class Node {
        String item;
        Node next;
    }

    private Node first = null;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    public void printStack() {
        // while node.next != null, 
        Node current = first;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }

    public static void main(String []args) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.pop();
        stack.push("5");
        stack.push("6");
        stack.pop();
        if (!stack.isEmpty()) {
            stack.printStack();
        }
    }
}