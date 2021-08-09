package com.nisum.saipravin.assignments.javanew;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a program to find the first non-repeated character in it.
 * 
 * @author sai praveen
 *
 */
public class NonRepeatingCharacterInString {

    /**
     * This is the main method used to find the first non repeating character in a
     * string.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        String inputString = "Hello World";
        LoggerUtility.logInfo("The input string is " + inputString);

        // Finding the first non-repeating character
        inputString.chars() // converting String to character stream
                .mapToObj(i -> Character.toLowerCase((char) i)) // convert to lower case and then to Character object
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1L).map(Map.Entry::getKey).findFirst()
                .ifPresent(i -> LoggerUtility.logInfo("The first non-repeating character in the list is " + i));

    }

}
