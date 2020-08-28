package JavaRush8;

import JavaRush7.ArrayList8Hard;
import com.javarush.test.Solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hard8 {
    public static void main(String[] args) {
        //напишите тут ваш код


        Human kid1 = new Human("Kidd1",true,5);
        Human kid2 = new Human("kid1",false,8);
        Human kid3 = new Human("kid3",true,10);


        Human mama = new Human("mama",false,29);

        mama.children.add(kid1);
        mama.children.add(kid2);
        mama.children.add(kid3);

        Human papa = new Human("papa",true,31);
        papa.children.add(kid1);
        papa.children.add(kid2);
        papa.children.add(kid3);


        Human ded1 = new Human("ded1",true,66);
        ded1.children.add(papa);


        Human ded2 = new Human("ded2",true,67);
        ded2.children.add(mama);

        Human bab1 = new Human("bab1",false,68);
        bab1.children.add(papa);


        Human bab2 = new Human("bab2",false,69);
        bab2.children.add(mama);

        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
        System.out.println(mama.toString());
        System.out.println(papa.toString());
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children ) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
 */
