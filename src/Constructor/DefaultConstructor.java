package Constructor;

public class DefaultConstructor {
    String name;
    int age;
    int rollno;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Roll Number:"+rollno);
    }

    static void main(String[] args) {
        DefaultConstructor def = new DefaultConstructor();
        def.display();
    }
}
