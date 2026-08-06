package Exercise1;

public class AccessModifier {
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;

    AccessModifier(){
        System.out.println("Values of different access modifiers are as follows:");
    }

}

class Hello extends AccessModifier{
    void show(){
        System.out.println("Value of public variable:"+a);
        System.out.println("Value of protected variable:"+c);
        System.out.println("Value of default variable:"+d);
    }
    public static void main(String[] args) {
      Hello obj = new Hello();
        obj.show();

    }
}
