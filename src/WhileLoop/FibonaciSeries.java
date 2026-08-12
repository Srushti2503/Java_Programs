package WhileLoop;
import java.util.Scanner;

public class FibonaciSeries {
int num;

void getdata(){
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter max no:");
    num = sc.nextInt();
}

void putdata(){
    int x=0,y=1,z=0;
    while(z<=num){
        System.out.println(z);
        x=y;
        y=z;
        z=x+y;
    }
}

    public static void main(String[] args) {
        FibonaciSeries obj = new FibonaciSeries();
        obj.getdata();
        obj.putdata();
    }
}
