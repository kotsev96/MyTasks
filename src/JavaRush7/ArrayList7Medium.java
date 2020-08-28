package JavaRush7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList7Medium {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            list.add(reader.readLine());
            if (list.get(i).contains("end")) {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.remove("end");
            System.out.println(list.get(i));
        }
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1 + "+" + name2 + "+" + name3 + " = Чистая любовь, да-да!");



        //напишите тут ваш код
    }
}

/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
строка
ещё
папа
мама
сын
дочь
коты
собака
программа
end
 */
