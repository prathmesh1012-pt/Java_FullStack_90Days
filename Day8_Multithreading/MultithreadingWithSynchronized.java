public class MultithreadingWithSynchronized {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        
        Runnable task = () -> account.withdraw(300);
        
        Thread t1 = new Thread(task, "user - prathmesh");
        Thread t2 = new Thread(task, "user - Sahil");
        t1.start();
        t2.start();
    }
    
}
class BankAccount{
    private int balance = 1000;
    public synchronized void withdraw(int amount){
        String threadName = Thread.currentThread().getName();
        if(balance >= amount){
            System.out.println(threadName + " is about to withdraw ₹" + amount);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        balance -= amount;
        System.out.println(threadName + " completed withdrawal. Remaining Balance: ₹" + balance);
        }
        else{
            System.out.print(threadName + "tried to Withdraw but INSUFFICINET Balance! Your Balance is "+ balance);
        }
    }
}