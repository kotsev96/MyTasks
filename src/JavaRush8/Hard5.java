package JavaRush8;

import com.javarush.test.Dog;

import java.util.*;

class Hard5 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>(4);

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result2 = new HashSet<Dog>(3);

        //напишите тут ваш код
        result2.add(new Dog());
        result2.add(new Dog());
        result2.add(new Dog());
        return result2;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<Object>();

        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);//напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        Iterator iterator = pets.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());//напишите тут ваш код
        }

        //напишите тут ваш код
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
