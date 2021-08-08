package com.nisum.saipravin.assignments.collections;

/**
 * A demo student class for demonstration of duplicate hash table keys.
 * 
 * @author sai praveen
 *
 */
public class Student {

    /**
     * Student name.
     */
    private String name;

    /**
     * Student Roll Number.
     */
    private int rollNumber;

    /**
     * Constructor for creation of student object.
     * 
     * @param name       the name of the student.
     * @param rollNumber the roll number of the student.
     */
    public Student(String name, int rollNumber) {
        super();
        this.name = name;
        this.rollNumber = rollNumber;
    }

    /**
     * Getter for student name.
     * 
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the student name.
     * 
     * @param name the name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for student roll number.
     * 
     * @return Roll number of the student.
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * Setter for the student roll number.
     * 
     * @param rollNumber the roll number of the student.
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    /**
     * Overridden hash code method.
     * 
     * @return hash code of the object.
     */
    @Override
    public int hashCode() {
        return this.getRollNumber();
    }

    /**
     * Converts the object into a string format.
     * 
     * @return the object in the form of a string.
     */
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
    }

    /**
     * method which determines whether given object is equal to this object.
     * 
     * @return true if given object is equal to this object else false.
     */
    @Override
    public boolean equals(Object obj) {
        Student student = null;
        if (obj instanceof Student) {
            student = (Student) obj;
        }
        if (this.getRollNumber() == student.getRollNumber()) {
            return true;
        } else {
            return false;
        }
    }
}