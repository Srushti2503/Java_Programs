package MultiThreading;

public class CreatingThread extends Thread{

    @Override
   public void run(){
        System.out.println("Child class thread.");
    }

    public static void main(String[] args) {
        CreatingThread obj = new CreatingThread();
        obj.start();
        System.out.println("Main class Thread.");
    }
}