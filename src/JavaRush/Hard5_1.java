package JavaRush;

import java.util.LinkedList;
import java.util.List;

public class Hard5_1 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("dfvd", 4);
    }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;
        public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        }
    }

}
