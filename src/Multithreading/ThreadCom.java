package Multithreading;

// Использование методов wait() и notify() для имитации часов
class TickTock {
    String state; // Содержит сведении о сотстоянии часов

    synchronized void tick(boolean running) {
        if (!running) { // Остановить часы
            state = "ticked";
            notify(); // Уведомить ожидающие потоки
            return;
        }
        System.out.print("Tick ");

        state = "ticked"; // Установить текущее состояние после такта "Tick"
        notify(); // Позволить выполняться методу tock()
        try {
            while (!state.equals("tocked"))
                wait(); // Ожидать до завершения метода tock()
        } catch (InterruptedException ехс) {
            System.out.println("Пpepывaниe потока");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) { // Остановить часы
            state = "tocked";
            notify(); // Уведомить ожидающие потоки
            return;
        }
        System.out.println("Tock");

        state = "tocked"; // Установить текущее состояние после такта "так"
        notify(); // Позволить выполняться методу tick ()
        try {
            while (!state.equals("ticked"))
            wait(); // Ожидать до завершения метода tick()
        } catch (InterruptedException ехс) {
            System.out.println("Пpepывaниe потока");
        }
    }
}
class MyThread2 implements Runnable{
    Thread thrd;
    TickTock ttOb;

    // Создать новый поток.
    MyThread2(String name, TickTock tt){
    thrd = new Thread(this, name);
    ttOb = tt;
    thrd.start(); // Запустить поток
    }//
// Начать выполнение нового потока
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0){
            for (int i = 0; i < 5; i++) ttOb.tick(true);
        ttOb.tick(false);
    }
    else {
        for(int i=0; i<5; i++) ttOb.tock(true);
        ttOb.tock(false);
        }
    }
}

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread2 mt1 = new MyThread2("Tick", tt);
        MyThread2 mt2 = new MyThread2("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException ехс) {
            System.out.println("Пpepывaниe основного потока");
        }
    }
}
