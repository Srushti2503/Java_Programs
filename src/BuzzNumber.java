import java.util.Scanner;
public class BuzzNumber{
    int num;
    void getdata(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check:");
        num=sc.nextInt();
    }
    void putdata(){
        if(num%7==0 || num%10==7){
            System.out.println(num+" is a buzz number.");
        }
        else{
            System.out.println(num+" is not a buzz number.");
        }
    }

    public static void main(String[] args) {
        BuzzNumber obj = new BuzzNumber();
        obj.getdata();
        obj.putdata();
    }
}