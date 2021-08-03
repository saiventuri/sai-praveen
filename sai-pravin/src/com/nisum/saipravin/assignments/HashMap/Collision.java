package com.nisum.saipravin.assignments.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 * @author sai praveen
 * Problem Statement : Write a program for real time hash collision
 *
 */

public class Collision {
	
	private int id;
	private String name;

	public Collision(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Collision [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		/* returning the id to reproduce collision */
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collision other = (Collision) obj;

		/* This will print every time collision occurs due to weak hash function */
		System.out.println("Equals method called for "+this.toString()+" and "+ obj.toString()+" to resolve collision by chaining");
		
		return id == other.id && Objects.equals(name, other.name);
	}
	
	public static void main(String args[]) {
		
		/* Initializing the Map */
		Map<Collision,Integer> collisionMap = new HashMap<Collision,Integer>();
		
		/* Initializing Collision Objects to insert into the map*/
		Collision obj1 = new Collision(1,"Sai");
		Collision obj2 = new Collision(2,"Praveen");
		Collision obj3 = new Collision(1,"Kamal");
		Collision obj4 = new Collision(1,"Vimal");
		Collision obj5 = new Collision(1,"Hari");
		
		System.out.println("Inserting objects into the map");
		
		/* Inserting into the map */
		collisionMap.put(obj1, 1);
		collisionMap.put(obj2, 1);
		collisionMap.put(obj3, 1);
		collisionMap.put(obj4, 1);
		collisionMap.put(obj5, 1);
		
		/* Printing the map */
		System.out.println(collisionMap);
	}
	

}
