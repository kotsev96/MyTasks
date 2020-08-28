package JavaRush8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Medium3 {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Коцев", 233);
        map.put("Мишин", 431);
        map.put("Сарсин", 1234);
        map.put("Пицин", 435);
        map.put("Коротков", 4353);
        map.put("Тинтин", 231);
        map.put("Моров", 3543);
        map.put("Теров", 1232);
        map.put("Калов", 243);
        map.put("Щербаков", 587);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
        Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();            //ключ
            Integer value = pair.getValue();        //значение
            if (value < 500) {
                iterator.remove();    // удаление текущей пары (на которую в данный момент указывает итератор)
            }

        }
    }

    public static void main(String[] args) {

    }
}
