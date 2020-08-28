package JavaRush9;

import JavaRush9.Easy2;

import java.io.IOException;
import java.rmi.RemoteException;

class Easy2 {
    public static void main(String[] args) {
        handleExceptions(new Easy2());

    }

    public static void handleExceptions(Easy2 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException e) {
            System.out.println(e);
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
/*
В методе handleExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch
 */
