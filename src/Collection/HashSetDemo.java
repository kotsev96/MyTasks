package Collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Создать хеш = множество
        HashSet<String> hs = new HashSet<>();

        // ВВести элементы в хеш-множество
        hs.add ( "Бета" ) ;
        hs.add ( "Альфа" ) ;
        hs.add ( "Эта" ) ;
        hs.add ( "Гамма" ) ;
        hs.add( "Эпсилон");
        hs.add( "Омега");

        System.out.println(hs);
    }
}
