package Encapsulation;

class Addition{
    private int x,y,z;

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public void setZ(int z){
        this.z=z;
    }


    void sum(){
        int s=x+y+z;
        System.out.println("Sum of X , Y & Z:"+s);
    }
}
public class CalculateSum {
    static void main(String[] args) {
        Addition aa= new Addition();
        aa.setX(10);
        aa.setY(5);
        aa.setZ(2);
        aa.sum();
    }
}
