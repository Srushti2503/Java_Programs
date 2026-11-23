package Java8.LambdaExpression;

interface MyInterface{
    void display();
}

public class HelloJava {
    public static void main(String[] args) {

        MyInterface obj=() ->{
            System.out.println("Hello Java8");
        };

        obj.display();


    }
}
