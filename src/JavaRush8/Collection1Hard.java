package JavaRush8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Collection1Hard {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int max = 1;
        for (int i=0; i<list.size()-1;i++)
        {
            if (list.get(i).equals(list.get(i + 1)))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count=1;
        }
        System.out.println(max);

    }
}
/*
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
 */
/*
89
12
12
98
111
42
98
98
98
71
Долго ломал голову без гугления готовых решений и в итоге реализовал
программу Самая длинная последовательность следующим образом:
1.Вводится переменная int k=1 (длина текущей последовательности).
В цикле проверяется равенство соседних элементов  и если да, то увеличиваем к,
если нет то к=1
2.Вводится новый список куда записывается длина последовательностей
3.Новый список сортируется встроенным методом по возрастанию
4.Выводится последний элемент нового списка.
 */
