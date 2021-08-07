package com.nisum.saipravin.assignments.oops;

/**
 * Interface containing the operations that can be
 * performed on a stack.
 * 
 * @author sai praveen
 *
 */
public interface StackOperations {

    /**
     * Pushes an element on to the stack.
     * 
     * @param item the item to be pushed on to the stack.
     */
    void push(Integer item);

    /**
     * Pops the top element of the stack without removing it from the stack.
     * 
     * @return the top element of the stack if stack is not empty else null.
     */
    Integer pop();

    /**
     * Fetches the top element of the stack.
     * 
     * @return the top element of the stack if stack is not empty else null.
     */
    Integer peek();

    /**
     * Checks whether stack is empty or not.
     * 
     * @return true if stack is empty else false.
     */
    boolean isEmpty();
}
