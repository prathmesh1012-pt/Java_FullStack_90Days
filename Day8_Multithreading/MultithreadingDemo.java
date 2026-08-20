// 1.Using Thread Class
// public class myThread extends Thread{
//     @Override
//     public void run(){
//         System.out.println("My Thread is Called");
//     }
// }

// 2.Using Implementing Runnable Inteface

class myThread1 implements Runnable {
    public void run(){
        System.out.println("My Thread is Called");
    }
}
class myThread2 implements Runnable {
    public void run(){
        System.out.println("My Thread is Called");
    }
}
class MultithreadingDemo{
    public static void main(String[] args) {
       Thread t1 = new Thread(new myThread1());
       Thread t2 = new Thread(new myThread2());
       t1.run();
       t2.start();
        
    }
}