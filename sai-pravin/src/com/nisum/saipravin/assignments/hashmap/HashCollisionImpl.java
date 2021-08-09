package com.nisum.saipravin.assignments.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem Statement : Write a program for real time hash collision.
 * 
 * @author sai praveen
 *
 */
public class HashCollisionImpl {

    /**
     * Id of the object.
     */
    private int id;

    /**
     * Name of the object.
     */
    private String name;

    /**
     * Constructor for creation of the object.
     * 
     * @param id   the id of the object.
     * @param name the name of the object.
     */
    public HashCollisionImpl(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * Getter for id.
     * 
     * @return the id of the object.
     */
    public int getId() {
        return id;
    }

    /**
     * Getter for name.
     * 
     * @return name of the object.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the object in a string form.
     * 
     * @return the object in string representation.
     */
    @Override
    public String toString() {
        return "Collision [id=" + id + ", name=" + name + "]";
    }

    /**
     * Returns the hash code of the object.
     * 
     * @return hash code of the object.
     */
    @Override
    public int hashCode() {
        /* returning the id to reproduce collision */
        return this.id;
    }

    /**
     * Method which checks the equality of this object with the given object.
     * 
     * @return true if given object equals this object else false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HashCollisionImpl other = (HashCollisionImpl) obj;

        /* This will print every time collision occurs due to weak hash function */
        LoggerUtility.logInfo("Equals method called for " + this.toString() + " and " + obj.toString()
                + " to resolve collision by chaining");

        return id == other.id && Objects.equals(name, other.name);
    }

    /**
     * This is the main method which is used for demonstration of hash collision.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        /* Initializing the Map */
        Map<HashCollisionImpl, Integer> collisionMap = new HashMap<>();

        /* Initializing Collision Objects to insert into the map */
        HashCollisionImpl obj1 = new HashCollisionImpl(1, "Sai");
        HashCollisionImpl obj2 = new HashCollisionImpl(2, "Praveen");
        HashCollisionImpl obj3 = new HashCollisionImpl(1, "Kamal");
        HashCollisionImpl obj4 = new HashCollisionImpl(1, "Vimal");
        HashCollisionImpl obj5 = new HashCollisionImpl(1, "Hari");

        LoggerUtility.logInfo("Inserting objects into the map");

        /* Inserting into the map */
        collisionMap.put(obj1, 1);
        collisionMap.put(obj2, 1);
        collisionMap.put(obj3, 1);
        collisionMap.put(obj4, 1);
        collisionMap.put(obj5, 1);

        /* Printing the map */
        LoggerUtility.logInfo(collisionMap.toString());
    }

}
