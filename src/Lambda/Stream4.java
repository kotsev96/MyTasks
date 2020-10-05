package Lambda;
/*
Эта функция представляет объект Collector, который определен в пакете java.util.stream. Мы можем написать свою реализацию функции, однако Java уже предоставляет ряд встроенных функций, определенных в классе Collectors:

toList(): преобразование к типу List

toSet(): преобразование к типу Set

toMap(): преобразование к типу Map

Например, преобразуем набор в потоке в список:
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> filteredPhones = phones.stream()
                .filter(s->s.length()<10)
                .collect(Collectors.toList());

        for (String filteredPhone : filteredPhones) {
            System.out.println(filteredPhone);
            
        }
    }
}
