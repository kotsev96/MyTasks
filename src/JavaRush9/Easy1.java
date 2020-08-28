package JavaRush9;

class Easy1 {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        //напишите тут ваш код
    }
}
