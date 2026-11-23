//Use a static method reference to print a message.

package Java8.MethodReference;

interface Message{
    void display();
}

public class StaticMethodReference {

    public static void ShowMessage(){
        System.out.println("Hello Java 8");
    }

    public static void main(String[] args) {

        Message obj= StaticMethodReference::ShowMessage;

        obj.display();
    }
}
