package Multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Help{
    String helpfile; // Имя файла содержащего справочную информацию

    Help(String fname){
        helpfile = fname;
    }
    // Отобразить справочную информацию по указанной теме
    boolean helpon(String what){
        int ch;
        String topic, info;
        // Открыть справочный файл
        try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile)))
        {
        do {
            // Читать символы, пока не встретится #
            ch = helpRdr.read();
            // Проверить совпадают ли темы
            if (ch == '#'){
                topic = helpRdr.readLine();
                if(what.compareTo(topic) == 0){ // Найти тему
                    do {
                        info = helpRdr.readLine();
                        if (info != null) System.out.println(info);
                    } while ((info != null) &&
                        (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != 1);
        }
        catch (IOException exc) {
            System.out.println("Oшибкa при попытке доступа к файлу справки");
            return  false;
        }
        return false; // тема не найдена
    }
    // Получить тему справки
    String getSelection(){
    String topic = "";

    BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

    System.out.print("Yкaжитe тему: ");
    try {
        topic = br.readLine();
        }
    catch(IOException ехс) {
        System.out.println("Oшибкa nри чтении с консоли");
        }
    return topic;
    }
}
public class FileHelp {
    public static void main(String[] args) {
        Help hp = new Help("helpfile.txt");
        String topic;
        System.out.println("Bocпoльэyйтecь справочной системой.\n" +
                "Для выхода из системы введите 'stop'.");
        do {
            topic = hp.getSelection();
            if (!hp.helpon(topic))
                System.out.println("Teмa не найдена.\n");
        } while(topic.compareTo("stop") != 0);
        }
}
