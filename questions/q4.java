package questions;
// Write a Java program to create two threads using the Runnable interface, where one thread prints even
// numbers from 1 to 10 and the other prints odd numbers from 1 to 10.

class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i = 0 ; i <= 10 ;i++){
            try{
                Thread.sleep(1000);
                if(i%2 == 0){
                    System.out.println(i);
                }
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }
}

class MyRunnable1 implements Runnable{

    @Override
    public void run(){
        for(int i = 0 ; i <= 10 ;i++){
            try{
                Thread.sleep(1000);
                if(i%2 != 0){
                    System.out.println(i);
                }
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable1);
        t2 .start();
        t1.start();
        
    }    
}
