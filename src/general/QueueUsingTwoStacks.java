package general;

import java.io.*;
import java.util.*;

/*
 * Implement in Java a first in first out (FIFO) queue using only two stacks. 
 * The implemented queue should support all the functions of a normal queue 
 * (push, peek, pop, and empty)
 */

 public class QueueUsingTwoStacks<T> {

    private Stack<T> pushStack;
    private Stack<T> popStack;

    public static void main(String[] args){
        System.out.println("Make unit Test");
    }

    public QueueUsingTwoStacks() {
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public void push(T element) {
        pushStack.push(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
        return popStack.peek();
    }

    public boolean isEmpty() {
        return pushStack.isEmpty() && popStack.isEmpty();
    }
}
