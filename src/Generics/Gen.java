package Generics;

// Простой обобщенный класс.
// Здесь Т - это параметр типа, вместо которого
// при создании объекта класса Gen будет подставляться
// реально существующий тип.

public class Gen<T> {
    T ob; // Объявить объект типа T

    // Передать конструктору ссылку на объект типа T
    Gen(T o){
        ob = o;
    }

    // Вернуть объект ob из метода
    T getOb(){
        return ob;
    }

    // Отобразить тип T
    void showType(){
        System.out.println("Tип Т - это" + ob.getClass().getName());
    }
}
// Демонстрация использования обобщенного класса
class GenDemo{
    public static void main(String[] args) {
        // Создать ссылку на объект типа Gen<Integer>
        Gen<Integer> iOb = new Gen<Integer> ( 88) ;;

        // Создать объект типа Gen<Integer> и присвоить ссылку на
        // него переменной iOb. Обратите внимание на автоупаковку при
        // инкапсуляции значения 88 в объекте типа Integer.


        // Отобразить тип данных, используемых в объекте iOb
        iOb.showType();

        // Получить значения из объекта iOb. Обратите внимание
        //на то, что приведение типов здесь не требуется.
        int v = iOb.getOb();
        System.out.println("знaчeниe: "+ v);

        System.out.println();
        // Создать объект типа Gen для строк
        Gen<String> strOb = new Gen<String>("Тестирование обобщений");
        // Отобразить тип данных, используемых в объекте strOb
        strOb.showType();

        // Получить значение из объекта strOb.
        // Заметьте, что приведение типов эдесь также не требуется.
        String str = strOb.getOb();
        System.out.println("знaчeниe: "+ str);

    }
}
