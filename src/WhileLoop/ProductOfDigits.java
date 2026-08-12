package WhileLoop;
import java.util.Scanner;

public class ProductOfDigits {
    int num,prod=1;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find product of its digits:");
        num = sc.nextInt();
        sc.close();
    }

    void putdata(){
        while(num>0){
            prod=prod*(num%10);
            num=num/10;
        }
        System.out.println("Product of digits of a given number:"+prod);
    }

    public static void main(String[] args) {
        ProductOfDigits obj = new ProductOfDigits();
        obj.getdata();
        obj.putdata();
    }
}
