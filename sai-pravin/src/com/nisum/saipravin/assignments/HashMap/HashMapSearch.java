package com.nisum.saipravin.assignments.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author sai praveen
 * Problem Statement: Write a program to check if a map contains the specified key/value.
 *
 */

public class HashMapSearch {

	public static void main(String[] args) {
		/* Initializing the hash map */
		Map<Integer,String> namesMap = new HashMap<Integer,String>();
		
		/* Adding key-value pairs to the map */
		namesMap.put(1, "Sai");
		namesMap.put(2, "Praveen");
		namesMap.put(3, "Lokesh");
		namesMap.put(4, "Keerthi");
		namesMap.put(5, "Vimal");
		
		System.out.println("Hash Map");
		System.out.println(namesMap);
		
		/* Searching for the key-value pair (3,Lokesh) in the map */
		if(namesMap.get(3) == "Lokesh") {
			System.out.println("Key value pair (3,Lokesh) found in the hash map");
		} else {
			System.out.println("Key value pair (3,Lokesh) not found in the hash map");
		}
		
		/* Searching for the key-value pair (2,Lokesh) in the map */
		if(namesMap.get(2) == "Lokesh") {
			System.out.println("Key value pair (2,Lokesh) found in the hash map");
		} else {
			System.out.println("Key value pair (2,Lokesh) not found in the hash map");
		}

	}

}
