package WhileLoop;
import java.util.Scanner;

public class TableOfNumber {
    int num;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its table:");
        num = sc.nextInt();
    }

    void putdata(){
        int i=1;
        while(i<=10){
            System.out.println(i*num);
            i++;
        }



    }

    public static void main(String[] args) {
        TableOfNumber obj = new TableOfNumber();
        obj.getdata();
        obj.putdata();
    }
}
