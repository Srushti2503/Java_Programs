package Encapsulation;

class Student{

    //declare private variables...
    private String stdName;
    private int stdId;
    private int stdRollNo;

    //apply public getter method for each private variable...
    public String getStdName(){
        return stdName;
    }
    public int getStdId() {
        return stdId;
    }
    public int getStdRollNo(){
        return stdRollNo;
    }

    //Apply public setter to set value of each private variable...

    public void setStdName(String stdName){
        this.stdName=stdName;
    }
    public void setStdId(int stdId){
        this.stdId=stdId;
    }
    public void setStdRollNo(int stdRollNo){
        this.stdRollNo=stdRollNo;
    }

    void putdata(){
        System.out.println("Name of student:"+stdName);
        System.out.println("Roll No of student:"+stdRollNo);
        System.out.println("ID of Student:"+stdId);
    }
}
public class EncapsulationTest {
    static void main(String[] args) {
        Student aa= new Student();
        aa.setStdName("Srushti");
        aa.setStdRollNo(101);
        aa.setStdId(1);
        aa.putdata();

    }
}
