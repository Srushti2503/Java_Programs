package Interface;

interface ConstantValues{
    int x=20;
    int y=30;
}

class Add implements ConstantValues{
    int a=x;
    int b=y;

    void show(){
        System.out.println("Value of A:"+a);
        System.out.println("Value of B:"+b);
    }

    void add(){
        int sum=a+b;
        System.out.println("Sum :"+sum);
    }
}
class Sub implements ConstantValues{

    void sub(){
        int sub=x-y;
        System.out.println("Subtraction:"+sub);
    }

}
public class InterfaceEg {
    public static void main(String[] args) {
        Add aa= new Add();
        aa.show();
        aa.add();

        Sub s=new Sub();
        s.sub();
    }
}
