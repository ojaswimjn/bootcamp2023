package thread;

public class MyThread implements Runnable{

    int a = 20, b= 10;

    @Override
    public void run() {
        addition();
        subtraction();
        multiplication();
    }

    void addition(){
        int sum = a+b;
        System.out.println("Addition: "+sum);
    }

    void  subtraction(){
        int sub = a-b;
        System.out.println("Subtraction: "+ sub);
    }

    void multiplication(){
        int multiply = a*b;
        System.out.println("Multiplication: "+multiply);
    }

    public static void main(String[] args) {
        MyThread th = new MyThread();
        Thread t = new Thread(th);
        t.start();
    }
}
