package ConstructorChaining;

public class Developed
{
    Developed()
    {
        System.out.println("Java was developed by James Gosling");
    }
    Developed(int year)
    {
        this("Java" , 1995);
        System.out.println("James Gosling is known as Father of Java programming language.");
    }

    Developed(String name, int year)
    {
        this();
        System.out.println("at Sun Microsystem and released in 1995");
    }

    void display()
    {
        System.out.println("The Java compiler is written in Java but Java runtime in ANSI C.");
    }

    public static void main(String[] args)
    {

        Developed obj = new Developed(1995);


        obj.display();
    }
}