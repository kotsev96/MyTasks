package JavaRush9;

class Easy6 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
Написать в цикле обратный отсчёт от 10 до 0.
Для задержки использовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.
 */
