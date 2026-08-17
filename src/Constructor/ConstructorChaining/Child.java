package Constructor.ConstructorChaining;

class Parent {
    Parent()
    {
        super();
        System.out.println("I am parent constructor");
    }
}
public class Child {
    Child() {
        System.out.println("I am child constructor");
    }
    public static void main(String[] args) {
        Child c = new Child();
    }
}

