package Java8.LambdaExpression;

interface SimpleInterest{
    double calculate(double p,double r,double t);
}

public class SimpleInterestCalculation {
    public static void main(String[] args) {

        SimpleInterest obj=(p,r,t)->{
            return ((p*r*t)/100);
        };

        System.out.println("Simple Interest:"+obj.calculate(1000,5,2));
    }
}
