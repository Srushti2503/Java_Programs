
//calculating sum of squares of numbers....
package ForLoop;
import java.util.Scanner;

public class SumOfSquares {
    int num,sum=0;

    void getdata(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter max no:");
        num=sc.nextInt();

    }

    void putdata(){
        for(int i=1;i<=num;i++){
            sum=sum+(i*i);
        }
        System.out.println("Sum of squares of a number:"+sum);
    }

    static void main(String[] args) {
        SumOfSquares s= new SumOfSquares();
        s.getdata();
        s.putdata();
    }

}
