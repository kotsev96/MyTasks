package JavaRush8;

import java.util.*;

class Hard2 {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Коцев", "Эльдар");
        map.put("Мишин", "Миша");
        map.put("Сарсин", "Саша");
        map.put("Пицин", "Каша");
        map.put("Коротков", "Игорь");
        map.put("Тинтин", "Анатолий");
        map.put("Моров", "Сергей");
        map.put("Теров", "Вася");
        map.put("Калов", "Саша");
        map.put("Щербаков", "Михаил");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        int count = 0;
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            for (Map.Entry<String, String> pair2 : copy.entrySet()) {
                if (pair.getValue().equals(pair2.getValue()))
                    count++;
            }
            if (count > 1)
                removeItemFromMapByValue(map, pair.getValue());
                count = 0;
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}