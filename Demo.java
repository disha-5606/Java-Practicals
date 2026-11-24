class Multithread extends Thread {
    public void run(){
        for( int i=0; i<=5; i++){
            System.out.println("Thread "+getName());
            
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        System.out.println(e.getMessage()) ;
           }
    }
}

class MyTask implements Runnable {
    public void run() {
  
        for( int i=0; i<=5; i++){
            System.out.println("Thread "+Thread.currentThread().getName());
            
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        System.out.println(e.getMessage()) ;
           }
        
    }
}
public class Demo{

    public static void main(String[] args) {
        Multithread t1 = new Multithread();
        Multithread t2 = new Multithread();
        t1.setName("Thread A");
        t2.setName("Thread B");
        t1.start();
        t2.start();

    }
}
