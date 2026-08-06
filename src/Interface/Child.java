package Interface;

interface Father{
    public abstract void msg1();
}

interface Mother{
 public abstract void msg2();
}

public class Child implements Father,Mother{
    public void msg1(){
        System.out.println("father loves his child");
    }

   public  void msg2(){
        System.out.println("Mother also loves her child");
    }
}

 class Child1 implements Father,Mother{
     public void msg1(){
         System.out.println("child loves papa");
     }

    public void msg2(){
         System.out.println("Child loves mumma");
     }

   public static void main(String[] args) {
        Child c= new Child();
        c.msg1();
        c.msg2();

        Child1 c1= new Child1();
        c1.msg1();
        c1.msg2();
    }
}

