package TypeCasting.java;

public class Addition {
    byte b=10;
    short s=1024;
    int i=100;
    long l=2000;
    char c='a';
    float f=1.5f;
    double d=1.5;


    void sum(){
        double sum=b+s+i+l+c+f+d;
        System.out.println("Addition of all type of datas:"+sum);
    }

    public static void main(String[] args) {
        Addition aa= new Addition();
        aa.sum();
    }
}
