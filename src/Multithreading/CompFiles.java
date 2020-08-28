package Multithreading;
import java.io.*;
// Упражнение 10.1 страница 373

public class CompFiles {
    public static void main(String[] args) {
        int i = 0, j = 0;
        // Прежде всего необхолдимо убедиться в том что программе передаются имена обоих файлов.
        if (args.length != 2) {
            System.out.println("Иcпoльзoвaниe: CompFiles файл! файл2");
            return;
        }
        // Сравнить файлы
        try(FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1]))
        {
            // Проверять содердимое каждого файла
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
            } while (i != -1 && j != -1);
            if(i != j)
                System.out.println("Coдepжимoe файлов отличается");
            else
                System.out.println("Coдepжимoe файлов отличается");
        } catch (IOException exc) {
            System.out.println("Oшибкa ввода-вывода: ");
        }

    }
}
