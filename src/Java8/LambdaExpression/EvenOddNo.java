package Java8.LambdaExpression;

interface CheckEvenOdd{
    void check(int n);
}
public class EvenOddNo {
    public static void main(String[] args) {
        CheckEvenOdd obj=(int n)->{
            if(n%2==0){
                System.out.println("Even no.");
            }
            else{
                System.out.println("Odd no.");
            }

        };
        obj.check(20);
    }
}
