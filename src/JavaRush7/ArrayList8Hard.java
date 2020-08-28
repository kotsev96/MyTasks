package JavaRush7;

public class ArrayList8Hard {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Леша",true,75);
        Human grandFather2 = new Human("Анатолий",true,74);
        Human grandMother1 = new Human("Маша",false,73);
        Human grandMother2 = new Human("Саша",false,72);
        Human father = new Human("Миша",true,43, grandFather1,grandMother1);
        Human mother = new Human("Даша",false,42, grandFather2, grandMother2);
        Human child1 = new Human("Ваня",true,18,father,mother);
        Human child2 = new Human("Вася",true,15,father,mother);
        Human child3 = new Human("Наташа",false,12,father,mother);
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());




    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
