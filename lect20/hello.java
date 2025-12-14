package lect20;

import lect18.tryCatch;

class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println("downloading file.."+(i*20)+"%");
            // timing function ek thread ko utne time k liye rok k rakhta hai
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){

            }
        }
    }
}

public class hello {
    public static void main(String[] args) {
        MyThread t1= new MyThread();
        t1.start();           // always for calling
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                
            }
        // System.out.println("hehe");
        // System.out.println("hii");
        for(int i=0;i<5;i++){
            System.out.println("timer"+i);
        }

    }
}
