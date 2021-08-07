package com.nisum.saipravin.assignments.oops;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement: Write a program on stack operation using interface.
 * 
 * @author sai praveen
 *
 */
public class Stack implements StackOperations {

    /**
     * Array where elements are placed.
     */
    private Integer[] stackArray;

    /**
     * the pointer that keeps track of top element in the stack.
     */
    private int topElementIndex;

    /**
     * Constructor used to create a stack object.
     * 
     * @param size the size of the stack.
     */
    public Stack(int size) {

        this.stackArray = new Integer[size];
        topElementIndex = -1;
    }

    /**
     * Pushes an element on to the stack.
     * 
     * @param item the item to be pushed on to the stack.
     */
    @Override
    public void push(Integer item) {

        if (topElementIndex == stackArray.length - 1) {

            LoggerUtility.logInfo("Stack overflow");
        } else {

            stackArray[++topElementIndex] = item;
        }
    }

    /**
     * Pops the top element of the stack.
     * 
     * @return the top element of the stack if stack is not empty else null.
     */
    @Override
    public Integer pop() {
        
        if (topElementIndex < 0) {

            LoggerUtility.logInfo("Stack underflow");
            return null;
        } else {

            return stackArray[topElementIndex--];
        }
    }

    /**
     * Fetches the top element of the stack without removing it from the stack.
     * 
     * @return the top element of the stack if stack is not empty else null.
     */
    @Override
    public Integer peek() {
        
        if (topElementIndex < 0) {

            LoggerUtility.logInfo("Stack underflow");
            return null;
        } else {

            return stackArray[topElementIndex];
        }
    }

    /**
     * Checks whether stack is empty or not.
     * 
     * @return true if stack is empty else false.
     */
    @Override
    public boolean isEmpty() {

        return (topElementIndex < 0);
    }

    /**
     * This is the main method used to
     * implement stack operations.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        Stack stack = new Stack(10);

        for (int i = 1; i <= 10; i++) {

            stack.push(i);
        }

        for (int i = 1; i < 10; i++) {

            LoggerUtility.logInfo(stack.pop().toString());
        }
        
        LoggerUtility.logInfo("The top element in the stack after pop operation is "
                              + stack.peek());
        
        stack.pop();
        
        LoggerUtility.logInfo("Stack is empty:" + stack.isEmpty());
    }

}
