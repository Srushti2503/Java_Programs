package SuperKeyword;

public class SuperClass {
  int x=20;
}

class SubClass extends SuperClass{
    int x=30;

    void display(){
        System.out.println("Value of X of subclass:"+x);
        System.out.println("Value of X of superclass:"+super.x);
    }

    public static void main(String[] args) {
        SubClass sc= new SubClass();
        sc.display();


    }
}
