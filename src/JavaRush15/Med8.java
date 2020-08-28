package JavaRush15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Med8 {
    public static int A;
    public static int B;
    static {
        try {
            A = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            B = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) throws IOException{
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}
