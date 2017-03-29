package edu.info448.review; //package declaration (needed)

/**
 * A simple model class representing a Husky
 * @author John Diego
 */
public class Husky extends Dog implements Huggable {
    public Husky(String name) {
        super(name, "Husky");
    }

    public void hug() {
		System.out.println("A husky is squished in a great big hug.");
	}

    public Husky() {
        super("Fido", "Husky");
    }

    public void bark() {
        System.out.println(this + " says: woof woof!");

    }

    public void pullSled() {
        System.out.println(this + " pulls the sled.");
    }
}