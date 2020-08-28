package Lambda;

interface MyFunc{
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {
        // локальная переменная, которая может быть захвачена
        int num = 10;

        MyFunc myLambda = (n) -> {
            // Такое использование переменной num корректно, поскольку
            // ее значение не изменяется
            int v = num + n;

            // Приведенная ниже инструкция некорректна,
            // поскольку она изменяет хначние переменной num
            // num ++;

            return v;
        };

        // Использование лямбды. Эта инструкция отобразит число 18
        System.out.println(myLambda.func(8));

        // Приведенная ниже строка породила бы ошибку, поскольку она
        // лишает num статуса финальной переменной
        // num = 9;
    }
}

/*
Как указано в комментариях к выполняющейся части программы, переменная num
не изменяется и может быть использована в теле myLamЬda. Поэтому в результате выполнения инструкции println () выводится число 18. При вызове func () с аргументом 8
значение v внутри лямбды устанавливается равным сумме num (значение 10) и значения,
переданного параметру n (которое равно 8). Следовательно, func () возвращает число
18. Этот механизм работает, поскольку переменная num не изменяет своего значения после инициализации. Но если бы значение num было изменено - будь-то в лямбда-выражении или вне его, - переменная num потеряла бы свой статус неизменной (final)
переменной . Это породило бы ошибку, препятствующую компиляции программы.
 */
