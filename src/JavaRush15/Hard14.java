package JavaRush15;
/*
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.


 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hard14 {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while(true){
            try {
                s = reader.readLine();
                if(s.equals("exit")) {
                    break;
                }
                else {
                    if(s.contains(".")){
                        print(Double.valueOf(s));
                    }
                    else if(Short.valueOf(s) > 0 && Short.valueOf(s) < 128){
                        print(Short.valueOf(s));
                    }
                    else if(Integer.valueOf(s) <= 0 || Integer.valueOf(s) >=128){
                        print(Integer.valueOf(s));
                    }
                    else print(String.valueOf(s));
                }
            } catch (NumberFormatException e) {
                print(s);
            }


        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
