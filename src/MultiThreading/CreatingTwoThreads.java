package MultiThreading;

public class CreatingTwoThreads {
    public static void main(String[] args) {

        Thread t1= new Thread(()->{
            for(int i=0;i<=5;i++){
                System.out.println("Thread A:"+i);
            }
        });


        Thread t2= new Thread(()->{
            for(int i=0;i<=5;i++){
                System.out.println("Thread B:"+i);
            }
        });

        t1.start();
        t2.start();
    }

}