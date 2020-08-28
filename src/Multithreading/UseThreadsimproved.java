package Multithreading;

// Усовершенствованная версия
class MyThrread implements Runnable{
    Thread thrd;

    // Создать новый поток
     public MyThrread(String name) {
         thrd = new Thread(this, name);
         thrd.start(); // запустить поток
    }

    // Начать выполнение нового потока
    @Override
    public void run() {
        System.out.println(thrd.getName() +" - запуск");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + ", счетчик:" + count);
            }
        }
        catch (InterruptedException ехс) {
            System.out.println(thrd.getName() +" - прерван");
        }
        System.out.println(thrd.getName() + " завершение");
    }
}

public class UseThreadsimproved {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        MyThrread mt = new MyThrread("Child #1");

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ехс) {
                System.out.println("Пpepывaниe основного потока");
            }
        }
        System.out.println("Зaвepшeниe основного потока");
    }
}
