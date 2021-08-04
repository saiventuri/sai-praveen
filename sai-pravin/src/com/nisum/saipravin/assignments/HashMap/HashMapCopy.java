package com.nisum.saipravin.assignments.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement: Write a program to copy all of the elements from the one map to another map.
 * @author sai praveen
 *
 */

public class HashMapCopy {

	public static void main(String[] args) {
		/* Initializing the hash map 1 */
		Map<Integer,String> namesMap1 = new HashMap<>();
		
		/* Adding key-value pairs to the map */
		namesMap1.put(1, "Sai");
		namesMap1.put(2, "Praveen");
		namesMap1.put(3, "Lokesh");
		namesMap1.put(4, "Keerthi");
		namesMap1.put(5, "Vimal");
		
		System.out.println("Hash Map 1");
		System.out.println(namesMap1);
		
		/* Initializing the hash map 2 */
		Map<Integer,String> namesMap2 = new HashMap<>();
		
		/* Adding key-value pairs to the map 2 */
		namesMap2.put(10, "Kamala");
		namesMap2.put(12, "Naresh");
		
		System.out.println("Hash Map 2");
		System.out.println(namesMap2);
		
		System.out.println("After copying elements from hash map 1 to hash map 2");
		
		namesMap2.putAll(namesMap1);
		
		System.out.println("Hash Map 2");
		System.out.println(namesMap2);

	}

}
