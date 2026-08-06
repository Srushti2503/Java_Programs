package Inheritance;

class BaseClass{

    void features(){
        System.out.println("Feature 1");
        System.out.println("Feature 2");
    }
}

class DerivedClass extends BaseClass{

    void ownFeature(){
        System.out.println("3rd feature");
    }
}

public class InheritanceTest {
    static void main(String[] args) {
        DerivedClass aa= new DerivedClass();
        aa.features();
        aa.ownFeature();
    }
}
