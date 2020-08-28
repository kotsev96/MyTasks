package JavaRush9;

import JavaRush7.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Med7 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                int i = Integer.parseInt(reader.readLine());
                list.add(i);
            }
        } catch (NumberFormatException | IOException e) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
/*
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода
 числа, то метод должен перехватить исключение и вывести
 на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
 */
