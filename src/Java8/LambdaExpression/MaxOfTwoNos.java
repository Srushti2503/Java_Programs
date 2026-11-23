package Java8.LambdaExpression;

interface MaxNo{
    int compare(int m,int n);
}
public class MaxOfTwoNos {
    public static void main(String[] args) {

        MaxNo obj=(m,n)->{

            if(m>n){
                return m;
            }
            else{
                return n;
            }
        };
        System.out.println("Max no:"+obj.compare(10,20));
    }
}
