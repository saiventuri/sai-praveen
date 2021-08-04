package com.nisum.saipravin.assignments.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement: Write a program to check if a map contains the specified key/value.
 * @author sai praveen
 *
 */

public class HashMapSearch {

	public static void main(String[] args) {
		/* Initializing the hash map */
		Map<Integer,String> namesMap = new HashMap<>();
		
		/* Adding key-value pairs to the map */
		namesMap.put(1, "Sai");
		namesMap.put(2, "Praveen");
		namesMap.put(3, "Lokesh");
		namesMap.put(4, "Keerthi");
		namesMap.put(5, "Vimal");
		
		System.out.println("Hash Map");
		System.out.println(namesMap);
		
		/* Searching for the key 3 in the map */
		if(namesMap.containsKey(3)) {
			System.out.println("Key 3 found in the hash map");
		} else {
			System.out.println("Key not found in the hash map");
		}
		
		/* Searching for the value Lokesh in the map */
		if(namesMap.containsValue("Lokesh")) {
			System.out.println("Value Lokesh found in the hash map");
		} else {
			System.out.println("Value Lokesh not found in the hash map");
		}

	}

}
