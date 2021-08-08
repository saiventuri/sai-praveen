package com.nisum.saipravin.assignments.collections;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Problem Statement : Write a program to Implement push() and pop() on Stack.
 * 
 * @author sai praveen
 *
 */
public class StackDemo {

    /**
     * stack to maintain the elements while push and pop operations.
     */
    private Stack<Integer> stack;

    /**
     * Constructs the stack demo object for push and pop operations.
     */
    public StackDemo() {

        super();
        this.stack = new Stack<>();
    }

    /**
     * Pushes the given element on to the stack.
     * 
     * @param element the element that is to be pushed on to the stack.
     */
    public void push(Integer element) {

        this.stack.push(element);
        LoggerUtility.logInfo("Pushing " + element + " to the stack");
        logStack();
    }

    /**
     * Pops the top element from the stack.
     * 
     * @return the element that is popped from the stack.
     * @throws EmptyStackException if stack is empty
     */
    public Integer pop() {

        Integer element = this.stack.pop();
        LoggerUtility.logInfo("Popping " + element + " from the stack");
        logStack();
        return element;
    }

    /**
     * Logs the elements of the stack.
     */
    private void logStack() {

        LoggerUtility.logInfo("The stack elements");
        LoggerUtility.logInfo(this.stack.toString());
    }

    /**
     * This is the main method used perform stack operations.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        // Create StackDemo object
        StackDemo stackDemo = new StackDemo();

        // Push new elements
        stackDemo.push(3);
        stackDemo.push(5);

        try {

            // Pop elements from the stack
            stackDemo.pop();
            stackDemo.pop();
            stackDemo.pop();
        } catch (EmptyStackException e) {

            LoggerUtility.logInfo("The stack is empty");
        }
    }

}
