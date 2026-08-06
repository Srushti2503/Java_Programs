package ThisKeyword;

public class SuperKeyword {
    SuperKeyword(){
      System.out.println("This is parent class constructor...");
  }
}

class child extends SuperKeyword{
    child(){
        super();
        System.out.println("This is child class constructor...");
    }

    static void main(String[] args) {
        child aa = new child();
    }
}
