package Multithreading;

public class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    /* Создание нового потока. Обратите внимание на то,
что конструктор не запускает поток на выполнение. */
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    // Начать выполнение нового потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        do {
            count++;

            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("B " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = true;
        System.out.println("\n" + thrd.getName() +
                " - завершение");
    }
}
class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");

        // Задать приоритеты
        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        // Запустить потоки на выполнение
        mt1.thrd.start();
        mt2.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException ехс) {
            System.out.println("Пpepывaниe основного потока");
        }
        System.out.println("\nCчeтчик потока High Priority: " + mt1.count);
        System.out.println("Cчeтчик потока Low Priority: " + mt2.count);
    }
}
