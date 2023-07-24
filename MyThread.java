package thread;

public class MyThread extends Thread{
    String task;

    MyThread(String task){
        this.task=task;
    }

    @Override
    public void run() {
        for(int i = 1 ; i<=5; i++){
            System.out.println(task +":"+ i );
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }

    }

    public static void main(String[] args) {
        MyThread Thread1= new MyThread("Cut the ticket.");
        MyThread Thread2 = new MyThread("Show the seat number");

        Thread t1 = new Thread(Thread1);
        Thread t2 = new Thread(Thread2);

        t1.start();
        t2.start();

    }
}
