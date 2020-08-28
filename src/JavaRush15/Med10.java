package JavaRush15;

public class Med10 {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
