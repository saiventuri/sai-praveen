package com.nisum.saipravin.assignments.javanew;

import com.nisum.saipravin.assignments.logging.LoggerUtility;
import java.util.Optional;

/**
 * Write a program for demonstrating use of Optional.
 * 
 * @author sai praveen
 *
 */
public class OptionalExample {

    /**
     * This is the main method used to demonstrate optional.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // Setting value for 5th index

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        LoggerUtility.logInfo(empty.toString());

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[5]);

        // If value is present, it returns an Optional otherwise returns an empty
        // Optional
        LoggerUtility.logInfo("Filtered value: " + value.filter(s -> s.equals("Abc")));
        LoggerUtility.logInfo("Filtered value: " + value.filter(s -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));

        // It returns value of an Optional. if value is not present, it throws an
        // NoSuchElementException
        LoggerUtility.logInfo("Getting value: " + value.get());

        // It returns hashCode of the value
        LoggerUtility.logInfo("Getting hashCode: " + value.hashCode());

        // It returns true if value is present, otherwise false
        LoggerUtility.logInfo("Is value present: " + value.isPresent());

        // It returns non-empty Optional if value is present, otherwise returns an empty
        // Optional
        LoggerUtility.logInfo("Nullable Optional: " + Optional.ofNullable(str[5]));

        // It returns value if available, otherwise returns specified value,
        LoggerUtility.logInfo("orElse: " + value.orElse("Value is not present"));
        LoggerUtility.logInfo("orElse: " + empty.orElse("Value is not present"));

        // printing value by using method reference
        value.ifPresent(LoggerUtility::logInfo);

    }

}
