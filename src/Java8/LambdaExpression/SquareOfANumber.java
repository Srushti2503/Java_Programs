package Java8.LambdaExpression;

interface SquareOfNo{
   int Square(int n);
}

public class SquareOfANumber {
    public static void main(String[] args) {

        SquareOfNo obj=(n)->{
            return n*n;
        };
        System.out.println("Square of a given no:"+obj.Square(5));
    }
}
