package learning;

import java.util.Scanner;

class MyRunnable implements Runnable {

    @Override
    public void run(){
        for(int i = 0; i<=5;i++){

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i == 5){
                System.out.println("Time's up");
            }
        }
    }
    
}
public class threading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyRunnable myrunnable = new MyRunnable();
        Thread thread = new Thread(myrunnable);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        sc.close();
    }
}
