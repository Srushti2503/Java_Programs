package Java8.LambdaExpression;

interface CheckString{
    boolean check(String str);
}

public class CheckFirstCharOfString {

    public static void main(String[] args) {
       CheckString obj=str ->{
           return str.startsWith("A");
       };
        System.out.println(obj.check("Apple"));
    }
}
