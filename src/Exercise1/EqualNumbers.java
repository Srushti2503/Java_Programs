package Exercise1;
import java.util.Scanner;

public class EqualNumbers {
int num1,num2;

void getdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st no:");
    num1=sc.nextInt();
    System.out.println("Enter 2nd no:");
    num2=sc.nextInt();
}
void putdata(){
    if(num1==num2){
        System.out.println("Both numbers are equal.");
    }
    else{
        System.out.println("Numbers are not equal.");
    }
}

    public static void main(String[] args) {
        EqualNumbers obj= new EqualNumbers();
        obj.getdata();
        obj.putdata();
    }

}
