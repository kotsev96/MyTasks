package AutoBox;

// Автоупаковка и автораспаковка при передаче
// параметров и возврате значений из методов

public class AutoBox2 {
    // Этот метод принимает параметр типа Integer
    static void m (Integer v){ // Получает Integer
        System.out.println("m() получил"+ v);
    }

    // Этот метод возвращает значение типа int
    static int m2(){
        return 10;
    }
    // Этот метод возвращает значение типа Integer
    static Integer mЗ (){
        return 99; // автоупаковка значения 99 в объект типа Integer
    }

    public static void main(String[] args) {
        // Передача методу m() значения типа int.
        // Метод m() принимает параметр типа Integer,
        // поэтому значение int автоматически упаковывается.
        m(199);
        // Объект iOb получает значение типа int, возвращаемое
        // методом m2(). Это значение автоматически упаковывается,
        // чтобы его можно было присвоить объекту iOb.
        Integer iOb = m2();
        System.out.println("Знaчeниe, возвращенное из m2(): "+ iOb);

        // Далее метод mЗ() возвращает значение типа Integer, которое
        // автоматически распаковывается и преобразуется в тип int.
        int i = mЗ();
        System.out.println("Знaчeниe, возвращенное из mЗ(): "+ i);

        // Далее методу Math.sqrt() в качестве параметра передается
        // объект iOb, который автоматически распаковывается, а его
        // значение повьппается до типа douЬle, требующегося для
        // выполнения данного метода.
        iOb = 100;
        System.out.
                println("Kopeнь квадратный из iOb: " + Math.sqrt(iOb));
        System.out.println("donvj");
    }
}
