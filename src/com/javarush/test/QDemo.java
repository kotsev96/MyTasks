package com.javarush.test;

class Queue {
    private double q[]; // Массив для хранения элементов очереди
    private int putloc, getloc; //индексы для вставки и извлечения очереди


    public Queue(int size) {
        q = new double[size+1]; //выделить память для очереди
        putloc = getloc = 0;
    }

    void put(double ch) {
        if(putloc == q.length-1) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Извлечь символ из очереди

    double get() {
        if(getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (double) 0;
        }
        getloc++;
        return q[getloc];
    }
}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        double ch;
        int i;
        System.out.println("Иcпoльзoвaниe очереди ЬigQ для сохранения алфавита");
// Поместить буквенные символы в очередь ЬigQ
        for(i=0; i < 26; i++)
            bigQ.put((double) ('A' + i));
        // Извлечь буквенные символы из очереди ЬigQ и отобразить
        System.out.print("Coдepжимoe очереди ЬigQ: ");
        for (i=0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (double) 0) System.out.print(ch);
        }
            System.out.println("\n");
            System.out.println("Иcпoльзoвaниe очереди smallQ для генерации ошибок");
// Использовать очередь srnallQ для генерации ошибок
            for (i = 0; i < 5; i++) {
                System.out.print("Пoпыткa сохранения " +
                        (double) ('z' - i));
                smallQ.put((double) ('Z' - i));
                System.out.println();
            }
                System.out.println();
// Дополнительные ошибки при обращении к очереди srnallQ
                System.out.print("Coдepжимoe smallQ: ");
                for (i = 0; i < 5; i++) {
                    ch = smallQ.get();
                    if(ch != (double) 0) System.out.print(ch);
                }
            }
        }
