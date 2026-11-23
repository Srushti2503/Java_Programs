package Encapsulation;

class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //setters.........
    public void setName(String name){
        this.name=name;

    }

    public void setAge(int age){
        this.age=age;
    }
}


public class Test {
    public static void main(String[] args) {
     Person aa= new Person();
     aa.setName("Srushti");
     aa.setAge(22);


     String per=aa.getName();
     int a=aa.getAge();

        System.out.println("Name of person:"+aa.getName());
        System.out.println("Age of person:"+aa.getAge());
    }
}
