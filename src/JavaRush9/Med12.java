package JavaRush9;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Med12 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> c = new HashMap<>();
        c.put("Марат1", new Cat("Марат1"));
        c.put("Марат2", new Cat("Марат2"));
        c.put("Марат3", new Cat("Марат3"));
        c.put("Марат4", new Cat("Марат4"));
        c.put("Марат5", new Cat("Марат5"));
        c.put("Марат6", new Cat("Марат6"));
        c.put("Марат7", new Cat("Марат7"));
        c.put("Марат8", new Cat("Марат8"));
        c.put("Марат9", new Cat("Марат9"));
        c.put("Марат10", new Cat("Марат10"));
        return c;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> sc = new HashSet<>();
        for (Map.Entry<String,Cat> m : map.entrySet()){
            sc.add(m.getValue());
        }

        return sc;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

