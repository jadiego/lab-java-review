package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

		System.out.println();

		Husky dubs = new Husky();
		dubs.bark(); //Because we’ve inherited from Dog, the Husky class gets all of the methods defined in Dog, should say woof
		dubs.pullSled(); // should work, but not for dog objects

		System.out.println();

		Dog v1 = new Husky("v1");
		v1.bark();
		//Husky v2 = new Dog(); -cant do it, type mismatch
		Huggable v2 = new Husky("v2");
		v2.hug(); //only method it has
		Huggable v3 = new TeddyBear();
		v3.hug(); //only method it has
		//Husky v4 = new TeddyBear(); -cant do it, type mismatch

		Husky v4 = (Husky) v1; //legal casting

		//Abstraction
		ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
		hugList.add(new Husky()); //a Husky is Huggable
		hugList.add(new TeddyBear()); //so are Teddybears!
		System.out.println();

		//enhanced for loop ("foreach" loop)
		//read: "for each Huggable in the hugList"
		// for (Huggabble thing : hugList) {
		// 	thing.hug();
		// }

		//Dog dog4 = new Animal(); - wont work

		System.out.println("Generics");
		System.out.println();
		
		GiftBox<Husky> huskygiftbox = new GiftBox<Husky>(new Husky("Carl"));
		huskygiftbox.openGift();
	}
}