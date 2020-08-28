package JavaRush9;

import java.io.IOException;

class Easy4 {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends IndexOutOfBoundsException {

    }


    static class MyException3 extends NullPointerException {

    }

    static class MyException4 extends NoSuchFieldException {

    }
}
/*
Есть четыре класса MyException, MyException2, MyException3, MyException4.
Унаследуй классы так, чтобы у тебя появилось любые два checked исключения
и любые два unchecked исключения.
 */
