package Inheritance.HasARelationship;

class Heart {

    void beat() {
        System.out.println("Heart is beating.");
    }
}

class Human {

    Heart heart;   // HAS-A relationship

    Human() {
        heart = new Heart();
    }

    void live() {
        heart.beat();
        System.out.println("Human is alive.");
    }
}

public class Composition {

    public static void main(String[] args) {
        Human h = new Human();
        h.live();
    }
}